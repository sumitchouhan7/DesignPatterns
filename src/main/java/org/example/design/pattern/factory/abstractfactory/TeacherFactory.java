package org.example.design.pattern.factory.abstractfactory;

import org.example.design.pattern.factory.Teacher;
import org.example.design.pattern.factory.User;

public class TeacherFactory {

    private String name;

    public User createTeacher(String name) {
        return new Teacher(name);
    }

}
