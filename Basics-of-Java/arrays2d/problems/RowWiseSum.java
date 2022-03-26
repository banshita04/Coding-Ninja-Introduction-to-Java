package arrays2d.problems;

public class RowWiseSum {
    public static void rowWiseSum(int[][] mat) {
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[i].length;j++){
                sum=sum+mat[i][j];
            }
            System.out.print(sum+" ");
        }

    }
}
