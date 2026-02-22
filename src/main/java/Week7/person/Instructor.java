package org.example.person;

import java.util.UUID;

public class Instructor extends Person {
    // Fields
    private String officeLocation;

    // Constructor
    public Instructor(UUID personId, PersonType personType, String name, String email, String extra, String officeLocation){
        super(personId, personType, name, email, extra);
        this.officeLocation = officeLocation;
    }

    public Instructor(UUID personId, String name, String email, String extra){
        super(personId, name, email, extra);
    }

    // Methods
    public String getOfficeLocation(){return this.officeLocation;}

    public String getRoleDescription(){
        return getPersonType() + ", Office Location: " + officeLocation +
                ", Description: A teacher leads a class by teaching their students about the class subject.";
    }

    @Override
    public String toString(){
        return super.toString() + " | Office: " + officeLocation;
    }
}
