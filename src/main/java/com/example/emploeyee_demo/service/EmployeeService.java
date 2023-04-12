package com.example.emploeyee_demo.service;

import com.example.emploeyee_demo.model.Employee;
import com.example.emploeyee_demo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
     List<Employee> getAllEmployee() ;

     Employee getEmployeeById(Integer employeeId);
}



