package com.example.graphqlsamples.repository;

import java.util.UUID;

import com.example.graphqlsamples.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, UUID> {
}
