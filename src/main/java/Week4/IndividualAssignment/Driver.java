package Week4.IndividualAssignment;

public class Driver {
    public static void main(String[] args){
        Animal animal1 = new Animal("Dinosaur", 5, 80.2, "Jungle");
        System.out.println(animal1);
        System.out.println(animal1.makeSound());

        Bird bird1 = new Bird("Hawk", 11, 18.34, "Tree", 14.3);
        System.out.println(bird1);
        System.out.println(bird1.makeSound());

        Fish fish1 = new Fish("Goldfish", 1, 2.5, "Lake", true);
        System.out.println(fish1);
        System.out.println(fish1.makeSound());

        Mammal mammal1 = new Mammal("Bear", 10, 48.4, "Forest", true);
        System.out.println(mammal1);
        System.out.println(mammal1.makeSound());
    }
}
