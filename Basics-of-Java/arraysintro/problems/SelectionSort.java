package arraysintro.problems;

public class SelectionSort {
    public static void selectionSort (int [] input) {
        for (int i=0; i<input.length-1; i++) {
            int min=input[i];
            int minIndex=i;
            for (int j=i+1; j<input.length; j++) {
                if (input[j]<min) {
                    min=input[j];
                    minIndex=j;
                }
            }
            if (minIndex != 0) {
                input[minIndex]=input[i];
                input[i]=min;

            }
        }
    }
}
