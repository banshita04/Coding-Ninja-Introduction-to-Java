package patterns.assignment;

import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mStar = 1;
        while (mStar <= n + 1) {
            if (mStar != 1) {
                int i = 1;
                System.out.print('*');
                while (i < mStar) {
                    System.out.print(i);
                    i = i + 1;
                }
                int j = mStar - 2;
                while (j >= 1) {
                    System.out.print(j);
                    j = j - 1;
                }
            }
            System.out.print('*');
            mStar = mStar + 1;
            System.out.println();
        }


        int test = 1;
        int lstar = n;
        while (lstar >= 1) {
            if (lstar != n) {
                System.out.print('*');
                int i = 1;
                while (i <= lstar - 1) {
                    System.out.print(i);
                    i = i + 1;
                }
                int j = n - test;
                while (j >= 1) {
                    System.out.print(j);
                    j = j - 1;
                }
                test = test + 1;
                System.out.print('*');
                System.out.println();
            }
            lstar = lstar - 1;
        }
        System.out.println('*');

    }
}
