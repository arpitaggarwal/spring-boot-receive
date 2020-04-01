package com.arpit.spring.oauth.service;

import com.arpit.spring.oauth.model.Employee;

import java.util.List;

public interface EmployeeService {

    String save(final Employee employee);

    void deleteEmployees();

    List<Employee> getEmployees();

    List<Employee> getEmployee(final Long employeeId);

}
