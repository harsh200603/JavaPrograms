package DSA;/* Variable Argument Lenght is used to argument multiple no of variable inputs in integer or String values
 
 */
import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        fun(33, 545, 3242, 54, 2, 54);
    }

    static void fun(int... v) {
        //int ...v creates an array of inputs stores the values of argument into arrays.
        System.out.println(Arrays.toString(v));
    }
    //For multiple variable arguments
    /*
     public static void main(String[] args) {
        fun(33, 545, "Harsh" , "Gupta");
    }
    static void fun(int a,int b,int... v) {
        
        
    } */

}
