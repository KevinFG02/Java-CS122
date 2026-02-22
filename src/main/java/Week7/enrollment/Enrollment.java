package org.example.enrollment;

import java.time.LocalDateTime;
import java.util.UUID;

public class Enrollment {
    // Fields
    private UUID enrollmentId;
    private UUID studentId;
    private UUID courseId;
    private LocalDateTime enrollmentDate;
    private EnrollmentStatus status;
    private double grade;

    // Constructor
    public Enrollment(UUID enrollmentId, UUID studentId, UUID courseId, LocalDateTime enrollmentDate, EnrollmentStatus status, double grade){
        this.enrollmentId = enrollmentId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollmentDate = enrollmentDate;
        this.status = status;
        this.grade = grade;
    }

    // Methods
    public UUID getEnrollmentId(){return this.enrollmentId;}

    public UUID getStudentId(){return this.studentId;}

    public UUID getCourseId(){return this.courseId;}

    public LocalDateTime getEnrollmentDate(){return this.enrollmentDate;}

    public EnrollmentStatus getStatus(){return this.status;}

    public double getGrade(){return this.grade;}

    public String toString(){
        return "Enrollment " + enrollmentId + " | Status: " + status + " | Grade: " + grade;
    }
}
