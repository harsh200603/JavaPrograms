package DSA;//Count the no of digits appearing in a number.
/* First the I/P of number is taken and then I/P of digit to be counted is taken and count is declared as 0
 Then the while loop is used to check the condition of the number and digit to be counted and
 if the digit is found then the count is incremented by 1 and the number is divided by
 10 to check the next digit and the loop continues till the number is not equal to 0

 */
import java.util.*;
class countdigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println("Enter the digit to be count : ");
        int digit=sc.nextInt();
        int count=0;

        while(n>0)
        {
            int rem=n%10;
            if(rem==digit)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println("The count of "+digit+" is "+count);
    }
}