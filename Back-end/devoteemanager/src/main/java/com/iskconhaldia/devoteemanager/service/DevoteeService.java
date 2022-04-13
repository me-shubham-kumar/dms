package com.iskconhaldia.devoteemanager.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.iskconhaldia.devoteemanager.bean.DesignationAndPermission;
import com.iskconhaldia.devoteemanager.bean.Devotee;
import com.iskconhaldia.devoteemanager.dao.DesignationAndPermissionDao;
import com.iskconhaldia.devoteemanager.dao.DevoteeDao;
import com.iskconhaldia.devoteemanager.exception.UserNotFoundException;

@Service
@Transactional
public class DevoteeService implements UserDetailsService{
	
	@Autowired
	public DevoteeDao devoteeDao;
	
	@Autowired
	public DesignationAndPermissionDao designationAndPermissionDao;
    
	
	@Override
	public UserDetails loadUserByUsername(String phoneNumber) throws UsernameNotFoundException {
		Devotee devotee = findDevoteeByPhoneNumber(Long.parseLong(phoneNumber));
		return new User(String.valueOf(devotee.getPhoneNumber()), devotee.getPassword(), new ArrayList<>());
	}
	
    public List<Devotee> findAllDevotee(){
    	return devoteeDao.findAll();
    }
    
    public Devotee addDevotee(Devotee devotee) {
    	System.out.println(devotee);
    	
    	return devoteeDao.save(devotee);
    }
    
    public Devotee updateDevotee(Devotee devotee) {
    	return devoteeDao.save(devotee);
    }
	
    public Devotee findDevoteeByPhoneNumber(long phoneNumber) throws UserNotFoundException{
    	return devoteeDao.findDevoteeByPhoneNumber(phoneNumber)
    			.orElseThrow(() -> new UserNotFoundException("Devotee by Phone Number " + phoneNumber + " was not found"));
    			
    }
    
    public Devotee findDevoteeByMyPhoneNumber(long phoneNumber) {
    	return devoteeDao.findDevoteeByMyPhoneNumber(phoneNumber)
    			.orElseThrow(() -> new UserNotFoundException("Devotee by Phone Number " + phoneNumber + " was not found"));
    }
    
    public void deleteDevotee(long phoneNumber) {
    	devoteeDao.deleteDevoteeByPhoneNumber(phoneNumber);
    }
    
    public List<Devotee> findUnAllocatedDevotee() {
    	return devoteeDao.findUnAllocatedDevotee();
    }
    
    public List<Devotee> findAllocatedDevotee() {
    	return devoteeDao.findAllocatedDevotee();
    }
    
    // Service related to Designation and Permission
    
    public List<DesignationAndPermission> findAllDesignationAndPermission(){
    	return designationAndPermissionDao.findAll();
    }
    
    public void deleteDesignationAndPermissionById(int id){
    	// first set all the devotee designation and permission field with this designationId as null then proceed for deletion.
    	designationAndPermissionDao.deleteDesignationAndPermissionByDesignationId(id);
    }
    
    public DesignationAndPermission saveDesignationAndPermission(DesignationAndPermission designationAndPermission){
    	return designationAndPermissionDao.save(designationAndPermission);
    }
    
    public DesignationAndPermission updateDesignationAndPermission(DesignationAndPermission designationAndPermission){
    	return designationAndPermissionDao.save(designationAndPermission);
    }
    
    public DesignationAndPermission findDesignationAndPermissionById(int id){
    	return designationAndPermissionDao.findDesignationAndPermissionByDesignationId(id)
    			.orElseThrow(() -> new UserNotFoundException("DesignationAndPermission by Designation Id" + id + " was not found"));
    }

}
