package com.m0rdred.dutyroster.rosterservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_workstation_assignment")
public class EmployeeWorkstationAssignmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    // Relationship with Employee
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee;

    // Relationship with Workstation
    @ManyToOne
    @JoinColumn(name = "workstation_id")
    private WorkstationEntity workstation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EmployeeEntity getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }

    public WorkstationEntity getWorkstation() {
        return workstation;
    }

    public void setWorkstation(WorkstationEntity workstation) {
        this.workstation = workstation;
    }

}