package com.example.emploeyee_demo.service;

import com.example.emploeyee_demo.model.Employee;
import com.example.emploeyee_demo.model.EmployeeRequest;
import com.example.emploeyee_demo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class EmployeeServiceImp implements EmployeeService{
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImp(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    @Override
    public List<Employee> getAllEmployee(){

        return employeeRepository.getAllEmployee();
    }

    @Override
    public Employee getEmployeeById(Integer employeeId) {
        return employeeRepository.getEmployeeById(employeeId);
    }

    @Override
    public Employee addNewEmployee(EmployeeRequest employeeRequest) {
        return employeeRepository.addNewEmployee(employeeRequest);
    }
}
