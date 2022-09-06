package com.emp.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emp.management.ServiceImpl.EmpServiceImpl;
import com.emp.management.model.Employee;

@RestController
public class EmpController {
@Autowired
EmpServiceImpl emp;
	
@RequestMapping(value="/value",method=RequestMethod.GET)
	public List<Employee> getalldetails() {
		List<Employee> list1= emp.getdata();
		return list1;
	}
	
	
}
