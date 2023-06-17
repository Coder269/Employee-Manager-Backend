package com.abbas.emplyeemanager.service;

import com.abbas.emplyeemanager.employee.Employee;
import com.abbas.emplyeemanager.exceptions.UserNotFoundException;
import com.abbas.emplyeemanager.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }

    public Employee updateEmployee(Employee employee) {
       return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee findEmployeeById (Long id) {
        return employeeRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User Not found!"));

    }
}
