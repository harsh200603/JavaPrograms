package DSA;

import java.util.*;

public class String_Parameter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name :");
        String naam = sc.nextLine();
        String greet = myName(naam);
        System.out.print(greet);
        /*Here naam is a String variable declared as a reference variable and the variable naam and name both will be pointing to the value of naam as in function naam value is passed.
        also the Strings can't be changed for Security reasons*/
    }

    static String myName(String name) {
        String mssg = "Hello ," + name;
        return mssg;
    }
}
