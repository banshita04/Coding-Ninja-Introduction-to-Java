package patterns;
import java.util.Scanner;
public class Pattern4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		while(i<=n) {
			int j = n;
			while(j>=1) {
				System.out.print(j);
				j = j - 1;
			}	
//			int j = 1;
//			while(j<=n) {
//				System.out.print(n-j+1);
//				j = j + 1;
//			}
			i = i + 1;
			System.out.println();
		}
	}
}
