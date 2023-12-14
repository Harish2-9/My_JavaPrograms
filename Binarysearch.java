package practice;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,key,i;
		int a[]=new int[10];
		System.out.println("Enter the n value: ");
	    n=sc.nextInt();
	    System.out.println("Enter key value to be searched -");
	    key=sc.nextInt();
		System.out.println("Enter the array values :");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		//----------------------------
		// 2 31 5 12 8 42
		int high=a.length,low=0,mid;
		System.out.println(high);
		
//		while(high>=low) {
//			mid=(low+high)/2;
//			if(a[mid]==key) {
//				System.out.println("found at "+a[mid]);
//			}
//		    
//				low=mid;
//			
//		}
//		
	}

}