package org.example.course;

import java.util.UUID;

public class HybridCourse extends Course {
    // Fields
    private double onlinePercentage;

    // Constructor
    public HybridCourse(UUID courseId, String courseCode, String title, int credits, Department department, double onlinePercentage){
        super(courseId, courseCode, title, credits, department);
        this.onlinePercentage = onlinePercentage;
    }

    // Methods
    public double getOnlinePercentage(){return this.onlinePercentage;}

    public double calculateTuition(){
        double tuition = getCredits() * 400.0;
        return tuition;
    }

    @Override
    public String toString(){
        return "[Hybrid] " + super.toString() + " | Online: " + onlinePercentage + "%";
    }
}
