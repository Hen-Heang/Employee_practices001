package com.example.emploeyee_demo.controller;

import com.example.emploeyee_demo.model.Employee;
import com.example.emploeyee_demo.model.EmployeeRequest;
import com.example.emploeyee_demo.service.EmployeeService;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.web.bind.annotation.*;

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

    //Insert employee
    @PostMapping("/employee")
    public Employee addNewEmployee(@RequestBody EmployeeRequest employeeRequest){
          Employee employee = employeeService.addNewEmployee(employeeRequest);
        return employee;
    }
    }



