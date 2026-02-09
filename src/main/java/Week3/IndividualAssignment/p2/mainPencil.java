package IndividualAssignmentWeek3.p2;
/*
    Kevin G Flores
    CS122
    1/24/26

    Problem 4 - Prints different pencil types from user input.
*/

public class mainPencil {
    public static void main(String[] args){
        Pencil bicPencil1 = new Pencil();
        System.out.println(bicPencil1.toString());

        Pencil bicPencil2 = new Pencil(true, "Bic", true);
        System.out.println(bicPencil2.toString());

        Pencil pilotPencil1 = new Pencil(true, false);
        System.out.println(pilotPencil1.toString());

        Pencil dixonPencil1 = new Pencil("Dixon");
        System.out.println(dixonPencil1.toString());
    }
}
