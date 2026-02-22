package Week7.course;

import java.util.UUID;

public class OnlineCourse extends Course {
    // Fields
    private String platform;

    // Constructor
    public OnlineCourse(UUID courseID, String codeCourse, String title, int credits, Department department, String platform){
        super(courseID, codeCourse, title, credits, department);
        this.platform = platform;
    }

    // Methods
    public String getPlatform(){return this.platform;}

    public double calculateTuition(){
        double tuition = getCredits() * 350.0;
        return tuition;
    }

    @Override
    public String toString(){
        return "[Online]" + super.toString() + " | Platform: " + platform;
    }
}
