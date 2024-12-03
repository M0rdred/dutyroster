package com.m0rdred.dutyroster.rosterservice.repository;

import com.m0rdred.dutyroster.rosterservice.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

    EmployeeEntity findByName(String employeeName);

}
