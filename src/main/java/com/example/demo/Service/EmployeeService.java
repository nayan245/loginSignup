package com.example.demo.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.Schema.EmployeeRequest;
import com.example.demo.Schema.EmployeeResponse;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;
    public EmployeeResponse employeeDetails( EmployeeRequest employeeRequest){

        EmployeeResponse employeeResponse = new EmployeeResponse();



       // public EmployeeResponse employeedetails(@NotNull)

        String username = employeeRequest.username;
        String passkey =  employeeRequest.password;

        Employee employee = employeeRepo.findByPersonID(1) ;

        if(employee.getUsername().equals(username)){
            if(employee.getPasskey().equals(passkey)){
               employeeResponse.message = "Login Successful";

            }else{
             employeeResponse.message = "Login failed, invalid password";

            }
        }else{
           employeeResponse.message = "Login failed, invalid username";

        }
        return employeeResponse;



    }


}
