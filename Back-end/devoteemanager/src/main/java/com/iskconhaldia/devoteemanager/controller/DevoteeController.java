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

import com.iskconhaldia.devoteemanager.bean.Devotee;
import com.iskconhaldia.devoteemanager.exception.UserNotFoundException;
import com.iskconhaldia.devoteemanager.service.DevoteeService;

@RestController
@RequestMapping("/devotee/v1")
@CrossOrigin(origins = "*")
public class DevoteeController {
	
	private final DevoteeService devoteeService;
	
	@Autowired
	public DevoteeController(DevoteeService devoteeService) {
		this.devoteeService = devoteeService;
	}
	
	@GetMapping("/all")
    public ResponseEntity<List<Devotee>> getAllDevotees () {
        List<Devotee> devotees = devoteeService.findAllDevotee();
        return new ResponseEntity<>(devotees, HttpStatus.OK);
    }

    @GetMapping("/find/{phoneNumber}")
    public ResponseEntity<Devotee> getDevoteeByPhoneNumber (@PathVariable("phoneNumber") long phoneNumber) {
        Devotee devotee = devoteeService.findDevoteeByPhoneNumber(phoneNumber);
        return new ResponseEntity<>(devotee, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Devotee> addDevotee(@RequestBody Devotee Devotee) {
        Devotee newDevotee = devoteeService.addDevotee(Devotee);
        return new ResponseEntity<>(newDevotee, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Devotee> updateDevotee(@RequestBody Devotee Devotee) {
        Devotee updateDevotee = devoteeService.updateDevotee(Devotee);
        return new ResponseEntity<>(updateDevotee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{phoneNumber}")
    public ResponseEntity<?> deleteDevotee(@PathVariable("phoneNumber") long phoneNumber) {
    	devoteeService.deleteDevotee(phoneNumber);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @GetMapping("/find/my/{phoneNumber}")
    public ResponseEntity<Devotee> getDevoteeByMyPhoneNumber (@PathVariable("phoneNumber") long phoneNumber) {
        Devotee devotee = devoteeService.findDevoteeByMyPhoneNumber(phoneNumber);
        return new ResponseEntity<>(devotee, HttpStatus.OK);
    }
    
    @GetMapping("/all/unallocated")
    public ResponseEntity<List<Devotee>> getAllUnAllocatedDevotees () {
        List<Devotee> devotees = devoteeService.findUnAllocatedDevotee();
        return new ResponseEntity<>(devotees, HttpStatus.OK);
    }
    
    @GetMapping("/all/allocated")
    public ResponseEntity<List<Devotee>> getAllAllocatedDevotees () {
        List<Devotee> devotees = devoteeService.findAllocatedDevotee();
        return new ResponseEntity<>(devotees, HttpStatus.OK);
    }
    
    @GetMapping("/checkduplicate/{phoneNumber}")
    public ResponseEntity<?> checkDuplicateDevotee (@PathVariable("phoneNumber") long phoneNumber) {
    	boolean isExist = false;
        try {
        	Devotee devotee = devoteeService.findDevoteeByPhoneNumber(phoneNumber);
            if(null != devotee) {
            	isExist = true;
            }
        }catch(UserNotFoundException e) {
        	System.out.println(e.getMessage());
        }
        return new ResponseEntity<>(isExist, HttpStatus.OK);
    }
    
    
    

}
