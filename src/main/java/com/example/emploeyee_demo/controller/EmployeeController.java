package com.example.emploeyee_demo.controller;

import com.example.emploeyee_demo.model.Employee;
import com.example.emploeyee_demo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/api/")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //Get all employee data
    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
            }


     //Get employee by id
    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") Integer employeeId){
        Employee employee = employeeService.getEmployeeById(employeeId);
        return employeeService.getEmployeeById(employeeId);
    }
    }



