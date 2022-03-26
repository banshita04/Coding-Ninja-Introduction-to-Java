package fundamentals.assignment;

import java.util.Scanner;

public class TotalSalary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double allow;
        int basic = sc.nextInt();
        char grade = sc.next().charAt(0);

        double hra = 0.20 * (double)basic;
        double da =  0.50 * (double)basic;
        double pf = 0.11 * (double)basic;

        if(grade == 'A'){
            allow = 1700.0;
        } else if(grade == 'B'){
            allow = 1500.0;
        } else {
            allow = 1300.0;
        }

        int totalSalary = (int) Math.round(basic + hra + da + allow - pf);
        System.out.println(totalSalary);
    }
}
