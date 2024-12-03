package com.m0rdred.dutyroster.rosterservice.service;

import com.m0rdred.dutyroster.rosterservice.entity.EmployeeEntity;
import com.m0rdred.dutyroster.rosterservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeEntity getEmployee(String employeeName) {
        return employeeRepository.findByName(employeeName);
    }

}
