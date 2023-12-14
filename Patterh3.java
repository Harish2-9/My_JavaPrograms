package practice;
import java.util.Scanner;
public class Patterh3 {
	
	public static void printpattern(int n) {
		for(int i=n;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("-");
			}
			for(int j=i;j<=n;j++) {				
			System.out.print("* ");
			}
			System.out.println();
		}	
	}	
	public static void main(String[] args) {		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int a=sc.nextInt();
		printpattern(a);
	}
}
