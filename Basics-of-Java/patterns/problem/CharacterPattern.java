package patterns.problem;

import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 0;
        char ch = 'A';
        while (i < n) {
            int j = 0;
            int k = i;
            while (j <= i) {
                System.out.print((char) (ch + k++));
                j = j + 1;
            }
            i = i + 1;
            System.out.println();
        }
    }
}
