package com.example.emploeyee_demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class EmployeeRequest {
    private String employeeName;
    private Double salary;
}
