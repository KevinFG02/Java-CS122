package Week1;
import java.util.Scanner;

public class Jan7 {
    public static void main(String[] args){
        Scanner inputValid = new Scanner(System.in);
        System.out.println("Type a Number:");
        int num = inputValid.nextInt();
        System.out.println("Number typed: " + num);
        function1(num);
    }

    public static void function1(int num){
        if (num == 4){
            System.out.println("Purple");
        } else if (num > 5 && num < 8){
            System.out.println("Red");
        } else if (num == 1) {
            System.out.println("White");
        } else if (num < 4) {
            System.out.println("Blue");
        } else if (num > 9) {
            System.out.println("Green");
        } else if (num == 9) {
            System.out.println("Yellow");
        } else if (num == 12) {
            System.out.println("Black");
        } else {
            System.out.println("Unknown Color");
        }
    }
}
