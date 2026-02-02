package Week4.IndividualAssignment;

public class Fish extends Animal{
    // Fields
    private boolean isFreshWater;

    // Constructor
    public Fish(String name, int age, double weight, String habitat, boolean isFreshWater){
        super(name, age, weight, habitat);
        this.isFreshWater = isFreshWater;
    }

    // Methods
    public boolean isFreshWater(){ return this.isFreshWater;}

    public String makeSound(){
        return "Bubbling noise.";
    }

    @Override
    public String toString(){
        String typeOfFish;
        if (isFreshWater == true){
            typeOfFish = "Freshwater Fish";
        }
        else {
            typeOfFish = "Saltwater Fish";
        }

        return super.toString() + ", Type: " + typeOfFish;
    }
}
