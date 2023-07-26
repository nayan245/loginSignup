package com.example.demo.Schema;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeRequest {

    @JsonProperty
    public String username;
    @JsonProperty
    public String password;
}
