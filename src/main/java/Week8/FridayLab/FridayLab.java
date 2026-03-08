package Week8.FridayLab;

public class FridayLab {
    public static void main(String[] args){
        /*
        String str = "Java"; // String literal
        String str2 = new String("java"); // Object

        char[] chars = new char[]{'j','s','e','r'};
        String str3 = new String(chars);

        byte[] bytes = {97,98,99,112,118};
        String str4 = new String(bytes);

        String emptyString = new String();
        String emptyString2 = "";

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(emptyString);
        System.out.println(emptyString2);
        */

        // String names are in the stack.
        /*
        String strL = "Java"; // String literal inside of the String pool which is inside of the heap.
        String strL3 = "Java"; // The same sting literal as strL inside the string pool.
        String name = "java2"; // A different string literal but is inside of the string pool.
        String strNew = new String("java"); // Inside of the heap.

        String strL2 = strL;
        String strNew2 = new String("java");
        */

        /*
        String myStr = "Java is cool";
        System.out.println(myStr.charAt(2));
        for (int i = 0; i < myStr.length(); i++){
            System.out.println(myStr.charAt(i) + ":" + myStr.codePointAt(i));
        }*/

        /*
        String stringLetters = "abc"; // Same string pool
        String stringLetters2 = "def";
        String stringLetters3 = "abc"; // Same string pool

        //System.out.println(stringLetters.compareTo(stringLetters2));
        //System.out.println(stringLetters == stringLetters2);
        //System.out.println(stringLetters == stringLetters3);
        System.out.println(System.identityHashCode(stringLetters)); // Same hashcode value
        System.out.println(System.identityHashCode(stringLetters3)); // Same hashcode value
        */

        /*
        String strLetters = new String("abc");
        String strLetters2 = new String("abc"); // not the same object

        System.out.println(strLetters == strLetters2);
        System.out.println(strLetters.equals(strLetters2));
        System.out.println(System.identityHashCode(strLetters)); // different hashcode value
        System.out.println(System.identityHashCode(strLetters2)); // different hashcode value
        */

        /*
        String s1 = "  ";

        System.out.println("Blank: " + s1.isBlank()); // returns true
        System.out.println("Empty: " + s1.isEmpty()); // returns false
        */

        /*
        String myStr = "Java bad is a bad    language   bad .";
        System.out.println(myStr);
        //myStr = myStr.replace("bad", "good");
        //myStr = myStr.replaceAll("bad", "good");
        //System.out.println(myStr);

        //myStr = myStr.replaceAll(" ", "");
        //System.out.println(myStr);
        */

        /*
        String str = "java";
        String str2 = " is cool.";
        //System.out.println(str);
        //str.toUpperCase(); // Doesn't catch the result
        str = str.toUpperCase();
        //System.out.println(str);
        str = str.concat(str2);
        System.out.println(str);
        */

        String java = "Java is a good language";
        //java = java.substring(3); cuts the first 4
        //java = java.substring(6,10);


        System.out.println(java);


    }
}
