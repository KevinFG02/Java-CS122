package org.example.person;

import java.util.UUID;

public class Student extends Person {
    // Fields
    private String major;

    // Constructor
    public Student(UUID personId, PersonType personType, String name, String email, String extra, String major){
        super(personId, personType, name, email, extra);
        this.major = major;
    }

    // Constructor
    public Student(UUID personId, String name, String email, String extra){
        super(personId, name, email, extra);
    }

    public String getMajor(){return this.major;}

    public String getRoleDescription(){
        return getPersonType() + ", Major: " + major +
                ", Description: A student attends classes and learns from their instuctor.";
    }

    @Override
    public String toString(){
        return super.toString() + " | Major: " + major;
    }
}
