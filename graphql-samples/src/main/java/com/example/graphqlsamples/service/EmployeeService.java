package com.example.graphqlsamples.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.example.graphqlsamples.model.Employee;
import com.example.graphqlsamples.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return StreamSupport.stream(employeeRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());

    }

    public Optional<Employee> getEmployeeByID(final UUID id) {
        return employeeRepository.findById(id);
    }
}
