package org.example.person;

import java.util.UUID;

public abstract class Person {
    // Fields
    private UUID personId;
    private String name;
    private String email;
    private PersonType personType;
    private String extra;

    // Constructor
    public Person(UUID personId, PersonType personType, String name, String email, String extra){
        this.personId = personId;
        this.name = name;
        this.email = email;
        this.personType = personType;
        this.extra = extra;
    }

    public Person(UUID personId, String name, String email, String extra){
        this.personId = personId;
        this.name = name;
        this.email = email;
        this.extra = extra;
    }

    // Methods
    public UUID getPersonId(){
        return this.personId;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public PersonType getPersonType(){
        return this.personType;
    }

    public String getExtra(){return this.extra;}

    public abstract String getRoleDescription();

    @Override
    public String toString(){
        return name + " (" + personType + ")";
    }
}
