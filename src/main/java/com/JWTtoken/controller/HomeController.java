package com.JWTtoken.controller;

import com.JWTtoken.entity.Employee;
import com.JWTtoken.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/welcome")
public class HomeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getEmployeeList(){
        return employeeService.getEmployee();
    }
}
