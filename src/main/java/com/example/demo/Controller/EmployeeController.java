package com.example.demo.Controller;


import com.example.demo.Entity.Employee;
import com.example.demo.Schema.EmployeeRequest;
import com.example.demo.Schema.EmployeeResponse;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/addDetails")
    public EmployeeResponse postDetails(@RequestBody EmployeeRequest employeeRequest){
        //EmployeeResponse employeeResponse = employeeService.employeeDetails(employeeRequest);
        return employeeService.employeeDetails(employeeRequest);
    }
}