package patterns.assignment;

import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int i = 1;
        while(i<=n) {
            int j = 1;
            while(j <= i) {
                if(j == 1)
                    System.out.print(j);
                else
                    System.out.print("+" + j);
                j = j + 1;
            }
            int k = 1;
            int sum = 0;
            while(k <= i){
                sum += k;
                k = k + 1;
            }
            System.out.print("=" + sum);
            i = i + 1;
            System.out.println();
        }
    }
}
