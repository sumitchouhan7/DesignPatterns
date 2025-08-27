package org.example.design.pattern.factory.abstractfactory;

import org.example.design.pattern.factory.Student;
import org.example.design.pattern.factory.Teacher;
import org.example.design.pattern.factory.User;

public class BiologyClassFactory extends  ClassRoomFactory{
    @Override
    public User createStudent(String name) {
        return new Student(name);
    }

    @Override
    public User createTeacher(String name) {
        return new Teacher(name);
    }
}
