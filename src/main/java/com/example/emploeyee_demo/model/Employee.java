package com.example.emploeyee_demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    private int employeeId;
    private String employeeName;
    private Double salary;

}
