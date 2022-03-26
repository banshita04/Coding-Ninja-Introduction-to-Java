package patterns;
import java.util.Scanner;
public class Pattern7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		while(i<=n) {
			int j = 1;
			int k = i;
			while(j <= i) {
				System.out.print(k++);
				j = j + 1;
			}
			i = i + 1;
			System.out.println();
		}
	}
}
