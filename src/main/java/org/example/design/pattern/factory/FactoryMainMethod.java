package org.example.design.pattern.factory;

import org.example.design.pattern.factory.abstractfactory.BiologyClassFactory;
import org.example.design.pattern.factory.abstractfactory.ClassRoomFactory;

public class FactoryMainMethod {

    public static void main(String[] args) {
        CreateUserFactory createUserFactory = new CreateUserFactory();

        createUserFactory.createStudent("sumit");
        createUserFactory.createTeacher("Vikas Divyakriti");

        ClassRoomFactory classRoomFactory = new BiologyClassFactory();

        classRoomFactory.createStudent("sumit");
        classRoomFactory.createTeacher("Vikas Divyakriti");

    }

}
