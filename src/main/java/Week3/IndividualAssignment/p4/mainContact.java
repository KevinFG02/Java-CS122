package Week3.IndividualAssignment.p4;
import java.util.Scanner;

/*
    Kevin G Flores
    CS122
    1/24/26

    Problem 7 - Prints an address and revising the address.
*/

public class mainContact {
    public static void main(String[] args){
        Scanner askUser = new Scanner(System.in);

        System.out.println("What is your full name?");
        String fullName = askUser.nextLine();

        System.out.println("What is the street number?");
        int streetNumber = askUser.nextInt();
        askUser.nextLine();

        System.out.println("What is the street name?");
        String streetName = askUser.nextLine();

        System.out.println("What is the city name?");
        String cityName = askUser.nextLine();

        System.out.println("What is the state name?");
        String stateName = askUser.nextLine();

        System.out.println("What is the zip number?");
        int zipNumber = askUser.nextInt();
        askUser.close();

        Contact newContact = new Contact(fullName, streetNumber, streetName, cityName, stateName, zipNumber);
        System.out.println(newContact.toString());

        System.out.println(newContact.updateAddress(17823, "South Ave Street", "Belleve", "WA", 178862));
    }
}
