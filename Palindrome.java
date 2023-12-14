package practice;
import java.io.*;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		int temp = n,sum =0,r;
		//System.out.println(temp);
		while(n>0) {
			  r=n%10;  //getting remainder  
			  sum=(sum*10)+r;    
			  n=n/10;
		}
		if(temp==sum) {
			System.out.println("number is palindrom");
		}
		else {
			System.out.println("Numner is not palindrome");
		}
	}

}
