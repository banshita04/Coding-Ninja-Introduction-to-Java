package functions.problem;

public class FahrenheitToCelsiusTable {
    public static void printFahrenheitTable(int start, int end, int step) {
        for (int i = start; i <= end; i += step) {
            System.out.println(i + " " + (int) (i - 32) * 5 / 9);
        }
    }
}
