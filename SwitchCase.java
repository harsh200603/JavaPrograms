package DSA;

import java.util.*;

class SwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Fruit Name :");
        String fruit = sc.next().toLowerCase();

        switch (fruit) {
            case "mango":
                System.out.println("Mango is king of fruits");
                break;

            case "apple":
                System.out.println("Apple is a healthy fruit");
                break;

            case "grapes":
                System.out.println("Grapes are sweet");
                break;

            case "pineapple":
                System.out.println("Pineapple is a juicy fruit");
                break;

            default:
                System.out.println("Invalid Input");

        }
    }
}

/* Switch Cases also has an enhanced version :
   switch(fruit)
   {
      case "mango" -> System.out.println("Mango is king of fruits");
      case "apple" -> System.out.println("Apple is a healthy fruit");
      case "grapes" -> System.out.println("Grapes are sweet");
      case "pineapple" -> System.out.println("Pineapple is a juicy fruit");
      default -> System.out.println("Please enter a valid fruit");
   }
 */
