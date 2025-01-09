package se.yrgo.classes;

import java.util.List;

public abstract class Employee {
    private String name;
    private String department;
    private List<Role> roles;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String name() {
        return name;
    }

    public String department() {
        return department;
    }

    @Override
    public String toString() {
        return String.format("%s at %s", name, department);
    }
}