package patterns;
import java.util.Scanner;
public class Pattern9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 0;
		char ch = 'A';
		while(i < n) {
			int j = 1;
			int k = i;
			while(j <= n) {
				System.out.print((char)(ch+k++));
				j = j + 1;
			}
			i = i + 1;
			System.out.println();
		}
	}
}
