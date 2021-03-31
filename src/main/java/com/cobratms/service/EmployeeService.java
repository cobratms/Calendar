package com.cobratms.service;

import com.cobratms.domain.Employee;
import com.cobratms.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee getByEmployeeID(long employee_id) {
        return employeeRepository.findByEmployeeID(employee_id);
    }
}
