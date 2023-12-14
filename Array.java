package practice;

public class Array {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,6,5,7};
		int key = 3;
		int n=a.length;
		
		array(a,key);
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
	
	
		public static int array(int a[],int val ){
			
		int b=0 ;
		int n=a.length;
		for(int i=0;i<n;i++) {
			if(a[i]!=4) {
				a[i]=777;
			}
		}
		return b;
		


}}
