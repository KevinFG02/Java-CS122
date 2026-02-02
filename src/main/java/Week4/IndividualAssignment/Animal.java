package Week4.IndividualAssignment;

public class Animal {
    private String name;
    private int age;
    private double weight;
    private String habitat;

    public Animal(String name, int age, double weight, String habitat){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.habitat = habitat;
    }

    public String getName(){return this.name;}

    public int getAge(){return this.age;}

    public double weight(){return this.weight;}

    public String habitat(){return this.habitat;}

    public String makeSound(){
        return "Animal makes sound.";
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight + ", Habitat: " + habitat;
    }
}
