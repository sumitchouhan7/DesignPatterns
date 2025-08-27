package org.example.design.pattern.factory;

public class Student implements User {

    private String name;

    public Student(String name) {
        this.name = name;
    }


    @Override
    public String userName() {
        return name;
    }
}
