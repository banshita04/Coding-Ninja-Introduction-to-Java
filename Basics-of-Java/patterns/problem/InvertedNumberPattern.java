package patterns.problem;

import java.util.Scanner;

public class InvertedNumberPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int i = n;
        while (i >= 1){
            int j = 1;
            while (j <= i){
                System.out.print(i);
                j = j + 1;
            }
            System.out.println();
            i = i - 1;
        }

    }

}
