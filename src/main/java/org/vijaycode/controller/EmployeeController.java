package org.vijaycode.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.vijaycode.entity.Employee;
import org.vijaycode.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class EmployeeController {


    private final EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee input) {
        return new ResponseEntity<>(employeeService.saveEmployee(input),
                HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployeeData() {
        return new ResponseEntity<>(employeeService.getAllEmployeeData(),
                HttpStatus.OK);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<Employee> getSingleEmployee(@PathVariable("employeeId") Integer EmployeeId) {
        return new ResponseEntity<>(employeeService.getSingleEmployee(EmployeeId),
                HttpStatus.OK);
    }

    @DeleteMapping("/{employeeId}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable("employeeId") Integer employeeId) {
        employeeService.deleteEmployee(employeeId);
        return new ResponseEntity<>(
                HttpStatus.OK);
    }







}
