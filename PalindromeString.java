package DSA;
//Program to Check whether the given String is Palindrome or not.
public class PalindromeString {
    public static void main(String[] args) {
        //Initialized String
        String str="abcba";

        //Calling and printing of function
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        str=str.toLowerCase();  //Converts the str input to lower case

        //If the str contains any null value or zero characters return false
        if(str==null || str.length()==0)
        {
            return false;
        }

        //Iterating over the String using start and end pointers
        for(int i=0;i<str.length()/2;i++){
            char start=str.charAt(i);  //Starts from the first character of string
            char end=str.charAt(str.length()-1-i);  //Starts from the end charachter of the String

            if(start!=end)
            {
                return false;
            }
        }
        return true;
    }
}
