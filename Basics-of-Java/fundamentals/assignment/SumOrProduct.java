package fundamentals.assignment;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int lim = sc.nextInt();
        int c = sc.nextInt();

        int sum = 0, pro = 1;
        if (c == 1){
            for (int i = 1; i <= lim; i++){
                sum = sum + i;
            }
            System.out.print(sum);
        }
        else if (c == 2){
            for (int i = 1; i <= lim; i++){
                pro = pro * i;
            }
            System.out.print(pro);
        }
        else
            System.out.print("-1");
    }
}
