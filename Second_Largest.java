package practice;

public class Second_Largest {

	public static void main(String[] args) {
		int []arr = {1,3,5,2,9,4,10};
		int l=arr.length,temp;
		for(int i =0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
			if(arr[i]>arr[j])
			{
				 temp = arr[i];    
                 arr[i] = arr[j];    
                 arr[j] = temp; 
			}
		}
	}
		System.out.println("Sorted array : ");
		for(int i=0;i<l;i++) {
			System.out.println(arr[i]+ " ");
		}
		System.out.println("Second largest number : "+arr[l-2]);
	}
}
