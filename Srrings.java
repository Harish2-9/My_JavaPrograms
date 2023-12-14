package practice;

import java.util.Scanner;
import java.io.*;

public class Srrings {

	public static void main(String[] args) {
		String a= "Hello";
		String str= "ABCDEFG is alphabet";
		
	//	String extstr=str.substring(1);
		//String extstr1=str.substring(5,6);
//		
//		System.out.println(str);
//		System.out.println(extstr);
//		System.out.println(extstr1);
//		
//		if(a.equals("Hello"))//to compare strings
//		System.out.println("yes");
		
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("t"));
		System.out.println(str.lastIndexOf("t"));
				    // String input with the Java Scanner
		    System.out.println("How old are you?");
		    Scanner stringScanner = new Scanner(System.in);
		    String age = stringScanner.nextLine();
		    System.out.println(age + " is a good age to be!");
		  }
		
	}


