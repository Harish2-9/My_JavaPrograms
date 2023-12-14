package practice;

public class FibonacciSeries {

	public static void main(String[] args) {
	//int a= 0;
	int b[]= new int[30];
	b[0]=0;
	b[1]=1;
	for(int i=2;i<2;i++) {
		b[i]=b[i-1]+b[i-2];
		//a=a+1;
	}
	System.out.println("Fibonacci series are..a.");
	for(int i=0;i<10;i++) {
		System.out.println(b[i]);
	}
	}

}
