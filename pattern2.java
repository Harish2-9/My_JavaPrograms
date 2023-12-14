package practice;
import java.util.*;

public class pattern2 {
	
	public static void printpattern(int n) {
		int i,j;
		 for (i = 1; i <= n; i++) { 
	            for (j = 1; j < i; j++) { 
	                System.out.print(" "); 
	            } 
	            for (j = i; j <= n; j++) { 
	                System.out.print("*" + " "); 
	            } 
				System.out.println();
			}
		}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no. the rows : ");
		int n = sc.nextInt();
		printpattern(n);
	}
}
