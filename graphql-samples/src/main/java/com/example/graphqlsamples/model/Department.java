package com.example.graphqlsamples.model;

import lombok.Data;

@Data
public class Department {

    private String name;
    private String head;
    private String organization;

    public Department(String name, String head, String organization) {
        this.name = name;
        this.head = head;
        this.organization = organization;
    }

    public Department() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}
