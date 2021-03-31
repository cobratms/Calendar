package com.cobratms.controller;

import com.cobratms.domain.Employee;
import com.cobratms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("/get/{employee_id}")
    public String showEmployeeInfo(@PathVariable("employee_id") int employee_id) {
        Employee employee = employeeService.getByEmployeeID(employee_id);
        return employee.toString();
    }

}
