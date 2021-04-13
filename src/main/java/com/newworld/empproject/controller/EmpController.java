package com.newworld.empproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newworld.empproject.domain.Employee;
import com.newworld.empproject.service.EmpService;
import com.newworld.empproject.vo.EmpRequest;
import com.newworld.empproject.vo.EmpResponse;

@RestController
@RequestMapping("/api")
public class EmpController {

	@Autowired
	EmpService empserv;
	
	@PostMapping("/salary")
	public ResponseEntity getEmplDetail(@RequestBody Employee emprqst) {
		EmpResponse empresp = empserv.getEmployee(emprqst);
		return new ResponseEntity(empresp,HttpStatus.OK);
	}
}
