package com.spring.test;

public class Employee {
    private String name;
    private long id;
    private String contactNumber;

    public Employee(String name, long id, String contactNumber) {
        this.name = name;
        this.id = id;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String contactNumber() {
        return contactNumber;
    }
}