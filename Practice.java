package practice;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {	
		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the array length : ");
//		int n=sc.nextInt();
//		int a[]=new int[20];
//		System.out.println("Enter the array values : ");
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();		
//		}
		int a[]= {1,1,2,3,4,4,5};
		System.out.println("Trimmed array values are : ");{
			for(int i=0;i<a.length-1;i++) {
				if(a[i]!=a[i+1])
				System.out.println(a[i]);
			}
		}
	}
}