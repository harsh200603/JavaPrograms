package DSA;//Find the nth number of the fibonacci series?
/*The Fibonacci series is a sequence of numbers in which each number is the sum of the two 
preceding numbers, usually starting with 0 and 1 
For eg: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...*/

/*a is declared as 0 and b is declared as 1 , these values are updated after every additon of a+b which is the new value for b. Hence b=a+b and the count is declared 2 because 0 and 1 are fixed first two no's of the series.  */
import java.util.*;
class fibonacci{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count<=n)
        {
            int c=b;
            b=a+b;
            a=c;
            count++;
        }
        System.out.println(b);

    }
}