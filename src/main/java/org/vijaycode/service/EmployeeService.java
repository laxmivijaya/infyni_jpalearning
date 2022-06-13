package org.vijaycode.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vijaycode.entity.Employee;
import org.vijaycode.repo.EmployeeRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    public Employee saveEmployee(Employee input) {
        return employeeRepo.save(input);
    }

    public List<Employee> getAllEmployeeData() {
        return employeeRepo.findAll();
    }

    public Employee getSingleEmployee(Integer employeeId) {
        return employeeRepo.findById(employeeId).get();
    }

    public void deleteEmployee(Integer employeeId) {
        employeeRepo.deleteById(employeeId);
    }
}
