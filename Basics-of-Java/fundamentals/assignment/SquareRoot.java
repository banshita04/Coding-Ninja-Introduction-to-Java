package fundamentals.assignment;

import java.util.Scanner;

public class SquareRoot {
    static int floorSqrt(int x)
    {
        if (x == 0 || x == 1)
            return x;

        int i = 1, result = 1;

        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }

    // Driver program
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        System.out.print(floorSqrt(x));
    }
}
