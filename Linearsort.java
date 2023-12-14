package practice;

import java.util.Scanner;

// linear sort program
public class Linearsort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*--------DYnamic input     	
		int n,key,i;
		int a[]=new int[10];
		System.out.println("Enter the n value: ");
	    n=sc.nextInt();
	    System.out.println("Enter key value to be searched -");
	    key=sc.nextInt();
		System.out.println("Enter the array values for insertion sort:");
		for(i=0;i<n;i++) 
			a[i]=sc.nextInt();
		--------------------------------*/
		  int[] arr = {8,4,3,2,5,1,7,6}; 
		  
//		  System.out.println("The array elements are:");
//		  for(int i=0;i<arr.length;i++) {
//			  System.out.println(arr[i]);
//		  }
		  int n=arr.length;
		  System.out.println("Array size : "+ n);
		  
	for(int i=0;i<n;i++) 
		  {
		if(arr[i]>arr[i+1]) 
			  {
				int temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		System.out.println("Sorted array : ");
		for(int i=0;i<=n;i++) {
			System.out.println(arr[i]);
		}	
	}
}
