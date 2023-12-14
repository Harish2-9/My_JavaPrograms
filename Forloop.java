package practice;

public class Forloop {

	public static void main(String[] args) {
		//String name="hello i'm Hari";
//		for(int i=0;i<name.length();i++) {
//			System.out.println(name.charAt(i));
//		}
//		for(int i=name.length()-1;i>=0;i--) {
//			System.out.println("char at :"+name.charAt(i));
//		}
//		for(int i=0;i<=100;i++) {
//			if(i%2==0) 
//			System.out.println("Even no: "+i);
//			else
//				System.out.println("Odd no : "+i);
		
		int counter =0;
		for(int i=0;i<=100;i++) {
			System.out.println(i);
			int temp=counter +1;
			counter=temp;
		}
	
		
	}

}
