package com.emp.management.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.management.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{



}
