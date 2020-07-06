package com.example.graphqlsamples.model;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
@Data
public class Employee {

    @PrimaryKey
    private Integer id;

    private String name;

    private String city;

    private Long sal;

    private Long phone;
}
