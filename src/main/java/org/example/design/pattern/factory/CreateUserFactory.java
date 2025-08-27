package org.example.design.pattern.factory;

public class CreateUserFactory {

    public  User createStudent(String name){
        return  new Student(name);
    }

    public User createTeacher(String name){
        return  new Teacher(name);
    }

}
