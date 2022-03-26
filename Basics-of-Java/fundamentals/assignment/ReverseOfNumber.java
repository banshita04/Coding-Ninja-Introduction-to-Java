package fundamentals.assignment;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int copy = n, rev = 0;
        while (n>0){
            int b = n % 10;
            rev = (rev * 10) + b;
            n= n / 10;
        }
        System.out.print(rev);
    }
}
