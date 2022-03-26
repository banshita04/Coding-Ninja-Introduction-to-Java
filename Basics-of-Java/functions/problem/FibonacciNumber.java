package functions.problem;

public class FibonacciNumber {
    public static boolean checkMember(int n){
        int a = 0, b = 1, c = 0;
        while (c < n)
        {
            c = a + b;

            a = b;

            b = c;
        }

        if(c == n)
            return true;
        else
            return false;
    }
}
