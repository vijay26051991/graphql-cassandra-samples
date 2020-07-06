package com.example.graphqlsamples;

import com.coxautodev.graphql.tools.SchemaParser;
import com.example.graphqlsamples.resolver.EmployeeQuery;
import com.example.graphqlsamples.service.EmployeeService;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLHttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlSamplesApplication {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(GraphqlSamplesApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean graphQLServlet() {
        return new ServletRegistrationBean(
                SimpleGraphQLHttpServlet.newBuilder(buildSchema(employeeService)).build(), "/graphql");
    }

    private static GraphQLSchema buildSchema(EmployeeService employeeService) {
        return SchemaParser
                .newParser()
                .file("graphql/schema.graphqls")
                .resolvers(new EmployeeQuery(employeeService))
                .build()
                .makeExecutableSchema();
    }

}
