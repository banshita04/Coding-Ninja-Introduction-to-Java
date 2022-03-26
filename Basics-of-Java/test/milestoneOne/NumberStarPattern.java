package test.milestoneOne;

import java.util.Scanner;

public class NumberStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= n){
            int j = n;
            while (j >= 1){
                if (j == i)
                    System.out.print("*");
                else
                    System.out.print(j);
                j = j - 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
