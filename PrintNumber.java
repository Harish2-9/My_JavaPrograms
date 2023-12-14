package practice;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n =sc.nextInt();
		String[] line = new String[n];
		for(int i=0;i<n;i++) {
			line[i]=sc.next();
		}
		//String line = sc.nextLine();
			for(int i=0;i<n;i++) {		
			if(line[i].equals("42")) {	
				break;
			}			
			else {
		       System.out.println(line[i]);
			}}
		
	}

}
