package patterns.problem;

import java.util.Scanner;

public class AlphaPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        char ch = 'A';
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(ch);
                j = j + 1;
            }
            System.out.println();
            ch = (char) (ch + 1);
            i = i + 1;
        }
    }
}
