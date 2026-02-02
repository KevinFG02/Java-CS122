package Week4.IndividualAssignment;

public class Bird extends Animal {
    private double wingSpan;

    public Bird(String name, int age, double weight, String habitat, double wingSpan){
        super(name, age, weight, habitat);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan(){ return this.wingSpan;}

    public String makeSound(){
        return "Chirps.";
    }

    @Override
    public String toString(){
        return super.toString() + ", Wingspan: " + wingSpan;
    }
}
