package test.milestoneOne;

import java.util.Scanner;

public class ZeroesAndStarsPattern {
    public static void main(String[] args) {
        int num,n,r,c;
        Scanner sc = new Scanner (System.in);
        num = sc.nextInt();
        n=num;
        for(r=1; r<=num; r++,n--)
        {
            for(c=1; c<r; c++)
                System.out.print("0");
            for(c=1; c<=n; c++)
            {
                if(c==1)
                    System.out.print("*");
                else
                    System.out.print("0");
            }
            System.out.print("*");
            for(c=1; c<n; c++)
                System.out.print("0");
            for(c=1; c<=r; c++)
            {
                if(c==1)
                    System.out.print("*");
                else
                    System.out.print("0");
            }
            System.out.println();
        }

    }
}
