package com.cobratms.service;

import com.cobratms.domain.Employee;
import com.cobratms.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee getByEmployeeID(long employeeId) {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        return employee.orElse(new Employee());
    }
}
