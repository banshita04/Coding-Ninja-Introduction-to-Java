package fundamentals.assignment;

import java.util.Scanner;

public class DecimalToBinary {
    public static void toBinary(long decimal){
        int binary[] = new int[40];
        int index = 0;
        while(decimal > 0){
            binary[index++] =(int) decimal%2;
            decimal = decimal/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
        System.out.println();//new line
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();
        if (n==0){
            System.out.print("0");
        }
        else
            toBinary(n);
    }
}
