package practice;
import java.util.Scanner;


public class Function {

	public static String EvenOdd(int n) {
	if(n%2==0) {
		return "Number is Even";
	}
	else {
		return "Number is ODD";
	}
	}
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the n value : ");
		int n=sc.nextInt();
		
		System.out.println(EvenOdd(n));
	
	}
}
