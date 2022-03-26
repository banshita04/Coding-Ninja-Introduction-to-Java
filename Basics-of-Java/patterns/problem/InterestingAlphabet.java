package patterns.problem;

import java.util.Scanner;

public class InterestingAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int k = n;
        int i = 1;
        while(i <= n){
            int j = 1;
            char ch = (char) (65 + k - i);
            while(j <= i){
                System.out.print(ch);
                ch = (char) (ch + 1);
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
