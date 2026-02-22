package org.example.course;

import java.util.UUID;

public class InPersonCourse extends Course {
    // Fields
    private String roomNumber;

    // Constructor
    public InPersonCourse(UUID courseID, String courseCode, String title, int credits, Department department, String roomNumber){
        super(courseID, courseCode, title, credits, department);
        this.roomNumber = roomNumber;
    }

    // Methods
    public String getRoomNumber(){return this.roomNumber;}

    public double calculateTuition(){
        double tuition = getCredits() * 550.0;
        return tuition;
    }

    @Override
    public String toString(){
        return "[In Person] " + super.toString() + " | Room: " + roomNumber;
    }
}
