package com.JWTtoken.service;

import com.JWTtoken.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

  private List<Employee> emplist= new ArrayList<>();

  public EmployeeService(){
      emplist.add(new Employee(UUID.randomUUID().toString(),"SUBHAM","subham@gmail.com"));
      emplist.add(new Employee(UUID.randomUUID().toString(),"suddharth","siddharth@gmail.com"));
  }
    public List<Employee> getEmployee(){
      return emplist;
    }

}
