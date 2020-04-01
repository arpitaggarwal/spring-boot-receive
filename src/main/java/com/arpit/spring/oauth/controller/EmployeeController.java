package com.arpit.spring.oauth.controller;

import com.arpit.spring.oauth.constants.ApplicationConstants;
import com.arpit.spring.oauth.model.Employee;
import com.arpit.spring.oauth.service.EmployeeService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(value = "/save")
    public ResponseEntity save(@RequestBody Employee employee) {
        final String status = employeeService.save(employee);
        if (StringUtils.isNotBlank(status) && ApplicationConstants.DUPLICATE.equals(status)) {
            return new ResponseEntity<>(
                    HttpStatus.BAD_REQUEST);
        } else if (StringUtils.isNotBlank(status) && ApplicationConstants.CREATED.equals(status)) {
            return new ResponseEntity<>("Employee Saved",
                    HttpStatus.CREATED);
        }
        return null;
    }


    @GetMapping(value = "/list")
    public ResponseEntity<List<Employee>> getEvents() {
        return new ResponseEntity<>(employeeService.getEmployees(),
                HttpStatus.CREATED);
    }

    @GetMapping(value = "/delete")
    public ResponseEntity deleteEvents() {
        employeeService.deleteEmployees();
        return new ResponseEntity<>(
                HttpStatus.OK);
    }

    @GetMapping(value = "/list/{employeeId}")
    public ResponseEntity<List<Employee>> get(@PathVariable Long employeeId) {
        List<Employee> filteredEvents = employeeService.getEmployee(employeeId);
        if (CollectionUtils.isNotEmpty(filteredEvents)) {
            return new ResponseEntity<>(filteredEvents,
                    HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(
                    HttpStatus.NOT_FOUND);
        }
    }

}
