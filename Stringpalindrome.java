package practice;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      String str=sc.next();
		  System.out.println("Enter the string:");
	//	String str="nayan";
		String revStr="";
		int l=str.length();
		//System.out.println(l);
		for(int i=l-1;i>=0;--i) {
			 revStr=revStr + str.charAt(i);
		}
		str=str.toLowerCase();
		revStr=revStr.toLowerCase();
		
		if(str.equals(revStr)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not a palindrom");
		}
	}

}
