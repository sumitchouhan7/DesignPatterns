package org.example.design.pattern.factory;

public class Teacher implements User {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public String userName() {
        return name;
    }
}
