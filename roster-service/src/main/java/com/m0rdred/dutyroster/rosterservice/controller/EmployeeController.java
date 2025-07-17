package com.m0rdred.dutyroster.rosterservice.controller;

import com.m0rdred.dutyroster.rosterservice.entity.EmployeeEntity;
import com.m0rdred.dutyroster.rosterservice.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public EmployeeEntity getEmployeeByName(@RequestParam String name) {
        return employeeService.getEmployee(name);
    }

    @GetMapping("/employees")
    public List<EmployeeEntity> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}
