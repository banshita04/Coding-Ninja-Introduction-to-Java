package fundamentals.problem;

import java.util.Scanner;

public class FahrenheittoCelsiusTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s, e, w, i;
        s = sc.nextInt();
        e = sc.nextInt();
        w = sc.nextInt();

        for (i = s; i <= e; i += w) {
            System.out.println(i + " " + (i - 32) * 5 / 9);
        }
    }
}
