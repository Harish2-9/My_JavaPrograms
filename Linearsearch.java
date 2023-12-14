package practice;

import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,key,count=0,flag=0;
		int a[]=new int[10];
		System.out.println("Enter the n value: ");
	    n=sc.nextInt();
		System.out.println("Enter the array values :");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter key value to be searched -");
	    key=sc.nextInt();
		
		for(int i=0;i<n;i++) {
		if(key==a[i]) {
			flag = i;
			count++;
		}
			}
		System.out.println("Key value found at index "+flag+", and no. of occurance is "+count);
//		for (int i=0;i<n;i++) {
//			System.out.println("Array elements are...."+a[i]);}
	}
}
