package patterns.assignment;

import java.util.Scanner;

public class ParallelogramPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int spaces = 1;
            while (spaces <= i - 1) {
                System.out.print(' ');
                spaces = spaces + 1;
            }
            int star = 1;
            while (star <= n) {
                System.out.print('*');
                star = star + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
