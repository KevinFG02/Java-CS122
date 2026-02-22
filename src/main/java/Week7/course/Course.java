package org.example.course;

import java.util.UUID;

public abstract class Course {
    // Fields
    private UUID courseId;
    private String courseCode;
    private String title;
    private int credits;
    Department department;

    // Constructor
    public Course(UUID courseId, String courseCode, String title, int credits, Department department){
        this.courseId = courseId;
        this.courseCode = courseCode;
        this.title = title;
        this.credits = credits;
        this.department = department;
    }

    // Methods
    public UUID getCourseId(){ return this.courseId;}

    public String getCourseCode(){return this.courseCode;}

    public String getTitle(){
        return this.title;
    }

    public int getCredits(){
        return this.credits;
    }

    public Department getDepartment(){return this.department;}

    public abstract double calculateTuition();

    @Override
    public String toString(){
        return courseCode + " - " + title + " (" + credits + " Credits, " + department + ")";
    }
}
