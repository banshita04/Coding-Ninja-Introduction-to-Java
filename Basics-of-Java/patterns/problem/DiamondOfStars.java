package patterns.problem;

import java.util.Scanner;

public class DiamondOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= n/2 + 1) {
            int spaces = 1;
            while (spaces <= n/2 + 1 - i) {
                System.out.print(' ');
                spaces = spaces + 1;
            }
            int j = 1;
            while (j <= i) {
                System.out.print('*');
                j = j + 1;
            }
            int k = i - 1;
            while (k >= 1) {
                System.out.print('*');
                k = k - 1;
            }
            i = i + 1;
            System.out.println();
        }

        int d = 1;
        while (d <= n / 2) {
            int space = 1;
            while (space <= d) {
                System.out.print(' ');
                space = space + 1;
            }
            int down = d;
            while (down <= n/2){
                System.out.print('*');
                down = down + 1;
            }
            int right = n/2;
            while (right > d){
                System.out.print('*');
                right = right - 1;
            }
            System.out.println();
            d = d + 1;
        }

    }
}
