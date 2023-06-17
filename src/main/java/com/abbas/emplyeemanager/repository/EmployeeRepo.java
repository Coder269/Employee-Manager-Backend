package com.abbas.emplyeemanager.repository;

import com.abbas.emplyeemanager.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
