package DSA;
//Checking of Prime Number
public class CheckPrime {
    public static void main(String[] args) {
        //Printing the Output if the given number is Prime or not.
        System.out.println(isPrime(7));
    }

    //Boolean Function for Checking the number.
    static boolean isPrime(int n)
    {
        //If the number equals to 1 less than 1 it is not Prime
        if(n<=1) {
            return false;
        }
        //Iterates over from 2 to sqrt of the number
        for(int i=2;i<=n/2;i++)
        {
            //If no is divisible by more than 1 and itself then it is not prime
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
