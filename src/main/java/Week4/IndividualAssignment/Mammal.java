package Week4.IndividualAssignment;

public class Mammal extends Animal{
    private boolean hasFur;

    public Mammal(String name, int age, double weight, String habitat, boolean hasFur){
        super(name, age, weight, habitat);
        this.hasFur = hasFur;
    }

    public boolean hasFur(){
        return this.hasFur;
    }

    public String makeSound(){
        return "Mammal Sounds.";
    }

    public String toString(){
        String typeOfMammal;

        if(hasFur == true){
            typeOfMammal = "Has Fur";
        } else {
            typeOfMammal = "Has no Fur";
        }

        return super.toString() + ", Fur: " + typeOfMammal;
    }
}
