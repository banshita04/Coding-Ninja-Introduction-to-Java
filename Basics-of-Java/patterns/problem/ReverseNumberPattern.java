package patterns.problem;

import java.util.Scanner;

public class ReverseNumberPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while(i <= n){
            int j = i;
            while(j >= 1){
                System.out.print(j);
                j = j - 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
