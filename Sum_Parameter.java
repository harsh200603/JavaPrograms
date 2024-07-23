package DSA;//Sum of two number using argument or parameter.

public class Sum_Parameter {

    public static void main(String[] args) {
        int ans = sum(20, 30);
        System.out.print("Sum is" + ans);

    }

    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
