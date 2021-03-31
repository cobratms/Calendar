package com.cobratms.repository;

import com.cobratms.domain.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Employee findByEmployeeID(Long employeeID);
}
