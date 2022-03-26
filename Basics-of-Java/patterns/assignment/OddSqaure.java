package patterns.assignment;

import java.util.Scanner;

public class OddSqaure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= 2 * n - 1) {
            int j = i;
            while (j <= 2 * n - 1) {
                System.out.print(j);
                j = j + 2;
            }
            int k = 1;
            while (k <= i - 1) {
                System.out.print(k);
                k = k + 2;
            }
            System.out.println();
            i = i + 2;
        }
    }
}
