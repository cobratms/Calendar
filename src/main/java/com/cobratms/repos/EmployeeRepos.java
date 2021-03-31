package com.cobratms.repos;

import com.cobratms.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepos extends CrudRepository<Employee, Long> {

    Employee findByEmployeeID(Long employeeID);
}
