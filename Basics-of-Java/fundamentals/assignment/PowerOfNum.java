package fundamentals.assignment;

import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        int p = 1;

        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            p *= x;
        }
        System.out.println(p);
    }
}
