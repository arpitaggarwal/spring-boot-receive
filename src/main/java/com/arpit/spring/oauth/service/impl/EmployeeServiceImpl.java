package com.arpit.spring.oauth.service.impl;

import com.arpit.spring.oauth.constants.ApplicationConstants;
import com.arpit.spring.oauth.model.Employee;
import com.arpit.spring.oauth.repository.EmployeeRepository;
import com.arpit.spring.oauth.service.EmployeeService;
import com.arpit.spring.oauth.util.ApplicationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * Create employee if id does not exists
     *
     * @param employee
     * @return
     */
    @Override
    @Transactional
    public String save(final Employee employee) {
        final List<Employee> employees = employeeRepository.findAll();
        boolean eventExist = employees.stream().anyMatch(e -> e.getId().equals(employee.getId()));
        if (eventExist) {
            return ApplicationConstants.DUPLICATE;
        } else {
            if (employee != null) {
                employeeRepository.save(employee);
                return ApplicationConstants.CREATED;
            }
        }
        return null;
    }

    /**
     * Find all employees from Database
     *
     * @return
     */
    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    /**
     * Delete all employees
     */
    @Override
    public void deleteEmployees() {
        employeeRepository.deleteAll();
    }

    /**
     * Find all events from Database for the provided actor id
     *
     * @return
     */
    @Override
    public List<Employee> getEmployee(final Long employeeId) {
        final List<Employee> events = employeeRepository.findAll();
        return events.stream().filter(e -> e.getId().equals(employeeId)).collect(Collectors.toList());
    }

}
