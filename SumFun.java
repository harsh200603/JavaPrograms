package DSA;

import java.util.*;

class SumFun {

    public static void main(String[] args) {
        sum();

    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second Number : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two numbers is : " + sum);

    }

    /*
    For using return value of sum this code is used: 
    public static void main(String[] args)
    {
        int add=sum();
        System.out.println("Sum of two numbers is : "+add);

    } 
    static int sum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int num1=sc.nextInt();
        System.out.print("Enter second Number : ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        return sum();
        

    }
     */
}
