package com.arpit.spring.oauth.repository;

import com.arpit.spring.oauth.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
