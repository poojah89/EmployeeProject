package com.newworld.empproject.vo;

import java.util.ArrayList;
import java.util.List;

import com.newworld.empproject.domain.Employee;

import lombok.Data;
@Data
public class EmpRequest {
	
	private List<Employee> employee;

}
