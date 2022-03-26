package fundamentals.problem;

import java.util.Scanner;

public class AllPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            int f = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    f = 1;
            }
            if (f != 1)
                System.out.println(i);
        }
    }
}
