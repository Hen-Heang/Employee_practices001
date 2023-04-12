package com.example.emploeyee_demo.repository;

import com.example.emploeyee_demo.model.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeRepository {

    //Select all employee
         @Select("""
                    select *from employee   
                 """)
         @Results(id="employeeMap" , value={
                 @Result(property = "employeeId", column = "id"),
                 @Result(property = "employeeName", column = "name")
         })

      List<Employee> getAllEmployee() ;


    //select employee by id
    @Select("""
               select *from employee
                where id=#{employeeId}
            """)
    
    @ResultMap("employeeMap")
    Employee getEmployeeById( Integer employeeId);
}
