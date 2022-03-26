package fundamentals.assignment;

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evensum = 0, oddsum = 0;
        while (n > 0) {
            int b = n % 10;
            if (b % 2 == 0) {
                evensum += b;
            } else {
                oddsum += b;
            }
            n = n / 10;
        }
        System.out.println(evensum + " " + oddsum);
    }
}
