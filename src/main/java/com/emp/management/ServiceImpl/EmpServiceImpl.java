package com.emp.management.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import com.emp.management.Repository.EmployeeRepository;
import com.emp.management.model.Employee;
import com.emp.management.service.EmpService;


@Component
public class EmpServiceImpl implements EmpService{
@Autowired
EmployeeRepository emprep;
@Override
	public List<Employee> getdata() {
		List<Employee> list=emprep.findAll();
		return list;
	}

	
	

}
