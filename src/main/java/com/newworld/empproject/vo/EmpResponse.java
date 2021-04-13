package com.newworld.empproject.vo;

import java.util.List;

import com.newworld.empproject.domain.Employee;

import lombok.Data;
@Data
public class EmpResponse extends BaseResponse{
	
	private Employee emp;

}
