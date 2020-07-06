package com.example.graphqlsamples.resolver;

import java.util.List;
import java.util.UUID;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphqlsamples.model.Employee;
import com.example.graphqlsamples.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class  EmployeeQuery implements GraphQLQueryResolver {

    private EmployeeService employeeService;

    public EmployeeQuery(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public List<Employee> allEmployees() {
        return employeeService.getAllEmployees();
    }

    public Employee employeeByID(final UUID id) {
        return employeeService.getEmployeeByID(id).get();
    }

}
