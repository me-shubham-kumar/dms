package com.iskconhaldia.devoteemanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iskconhaldia.devoteemanager.bean.DesignationAndPermission;
import com.iskconhaldia.devoteemanager.bean.Devotee;
import com.iskconhaldia.devoteemanager.service.DevoteeService;

@RestController
@RequestMapping("/designationandpermission/v1")
@CrossOrigin(origins = "*")
public class DesignationAndPermissionController {
	
	private final DevoteeService devoteeService;
	
	@Autowired
	public DesignationAndPermissionController(DevoteeService devoteeService) {
		this.devoteeService = devoteeService;
	}
	
	@GetMapping("/all")
    public ResponseEntity<List<DesignationAndPermission>> getAllDesignationAndPermission () {
        List<DesignationAndPermission> designationAndPermission = devoteeService.findAllDesignationAndPermission();
        return new ResponseEntity<>(designationAndPermission, HttpStatus.OK);
    }

    @GetMapping("/find/{designationId}")
    public ResponseEntity<DesignationAndPermission> getDesignationAndPermissionById (@PathVariable("designationId") int designationId) {
    	DesignationAndPermission designationAndPermission = devoteeService.findDesignationAndPermissionById(designationId);
        return new ResponseEntity<>(designationAndPermission, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<DesignationAndPermission> addDesignationAndPermission(@RequestBody DesignationAndPermission designationAndPermission) {
    	DesignationAndPermission newDesignationAndPermission = devoteeService.saveDesignationAndPermission(designationAndPermission);
        return new ResponseEntity<>(newDesignationAndPermission, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<DesignationAndPermission> updateDesignationAndPermission(@RequestBody DesignationAndPermission designationAndPermission) {
    	DesignationAndPermission updateDesignationAndPermission = devoteeService.updateDesignationAndPermission(designationAndPermission);
        return new ResponseEntity<>(updateDesignationAndPermission, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{designationId}")
    public ResponseEntity<?> deleteDesignationAndPermission(@PathVariable("designationId") int designationId) {
    	devoteeService.deleteDesignationAndPermissionById(designationId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
