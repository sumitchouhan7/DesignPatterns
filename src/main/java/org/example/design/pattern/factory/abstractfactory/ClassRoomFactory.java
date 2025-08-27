package org.example.design.pattern.factory.abstractfactory;

import org.example.design.pattern.factory.Student;
import org.example.design.pattern.factory.Teacher;
import org.example.design.pattern.factory.User;

public abstract class ClassRoomFactory {

    public abstract User createStudent(String name);
    public abstract User createTeacher(String name);
}
