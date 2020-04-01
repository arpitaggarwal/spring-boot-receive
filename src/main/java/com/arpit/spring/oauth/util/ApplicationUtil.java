package com.arpit.spring.oauth.util;

import com.arpit.spring.oauth.model.Address;
import com.arpit.spring.oauth.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class ApplicationUtil {

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("Arpit");
        Address address = new Address();
        address.setCity("Delhi");
        address.setId(1L);
        address.setZipCode("250002");
        employee.setAddress(address);
        employees.add(employee);
        return employees;
    }
}
