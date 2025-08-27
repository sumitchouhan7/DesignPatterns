package org.example.design.pattern.factory.abstractfactory;

import org.example.design.pattern.factory.Student;
import org.example.design.pattern.factory.User;

public class StudentFactory {

    private String  name;

    public User createStudent(String name){
        return  new Student(name);
    }
}
