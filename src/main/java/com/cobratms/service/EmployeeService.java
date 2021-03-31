package com.cobratms.service;

import com.cobratms.entity.Employee;
import com.cobratms.repos.EmployeeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private EmployeeRepos employeeRepos;

    @Autowired
    public EmployeeService(EmployeeRepos employeeRepos) {
        this.employeeRepos = employeeRepos;
    }

    public Employee getByEmployeeID(long employee_id) {
        return employeeRepos.findByEmployeeID(employee_id);
    }
}
