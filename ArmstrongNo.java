package DSA;/* Armstrong no refers to sum of cube of every digit of the no. equals the original no.  */
import java.util.*;

public class ArmstrongNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sc.nextInt();
        boolean ans = Armstrong(n);
        System.out.println(ans);
        System.out.print("Armstrong numbers from 100 to 1000 are ");
//For loop for printing Armstrong numbers from 100 to 1000
        for (int i = 100; i < 1000; i++) {
            if (Armstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
//This function checks whether the input no is Armstrong or not returns True or else False.

    static boolean Armstrong(int n) {
        int original = n;
        int sum = 0;
        while (original > 0) {
            int rem = original % 10;
            sum = sum + rem * rem * rem;
            original = original / 10;
        }
        return sum == n;

    }

}
