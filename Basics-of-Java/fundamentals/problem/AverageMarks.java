package fundamentals.problem;

import java.util.*;

public class AverageMarks {


    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();

        int average = (marks1 + marks2 + marks3) / 3;

        System.out.println(name);
        System.out.println(average);
    }

}

