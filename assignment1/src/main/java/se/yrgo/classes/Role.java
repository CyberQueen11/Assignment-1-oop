package se.yrgo.classes;

public class Role {
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format(name);
    }
}
