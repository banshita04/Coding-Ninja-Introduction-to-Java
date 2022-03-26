package fundamentals.assignment;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++){
            if ((3*i+2)%4==0){
                x++;
                continue;
            }
            else
                System.out.print((3*i+2) + " ");
        }
    }
}