package com.newworld.empproject.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.newworld.empproject.domain.Employee;
import com.newworld.empproject.vo.EmpRequest;
import com.newworld.empproject.vo.EmpResponse;

@Service
public class EmpService {
	public EmpResponse getEmployee(Employee emprqst) {
		EmpResponse empResp = new EmpResponse();
		
		
		
		//List<Employee> empobj = new ArrayList<Employee>();
	//	empobj.addAll(emprqst);
		
	/*
	 * for(int i = 0; i<empobj.size();i++) {
	 * 
	 * Employee indvEmployee = empobj.get(i);
	 * indvEmployee.setSalary(indvEmployee.getSalary()+1000); empobj.add(i,
	 * indvEmployee);
	 * 
	 * 
	 * }
	 */
		emprqst.setSalary(emprqst.getSalary()+1000);
		empResp.setEmp(emprqst);
		
		
		
		empResp.setOutcomeCode(200);
		empResp.setOutcomeMessage("Success");
		empResp.setOutcomeUserMessage("Success");
		return empResp;
	}

}
