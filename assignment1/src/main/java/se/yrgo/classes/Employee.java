package se.yrgo.classes;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String department;
    private Role initialRole;
    private List<Role> roles;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public Employee(String name, String department, Role initialRole) {
        this(name, department);
        this.initialRole = initialRole;

        this.roles = new ArrayList<>();
        roles.add(initialRole);
    }

    public String name() {
        return name;
    }

    public String department() {
        return department;
    }

    public void addRole(Role role) {
        roles.add(role);
    }

    @Override
    public String toString() {
        return String.format("%s at %s with roles: %s", name, department, roles.toString());
    }
}