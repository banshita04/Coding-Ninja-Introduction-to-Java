package arraysintro.assignment;

public class PairSum {
    public static int pairSum(int[] arr, int num){
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {


                if(arr[i]+arr[j]==num)
                    count++;
            }
        }
        return count;
    }
}
