package DSA;//Reversing a number

import java.util.*;
class reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int reverse=0;
        while(num>0)
        {
            int rem=num%10;
            num=num/10;
            reverse=reverse*10+ rem;
        }
        System.out.println("Reverse of the number is:"+reverse);
    }
}