package practice;

public class Loops {

	private static final boolean True = false;
	public static void main(String[] args) {
//		int count=1;
//		while(count<3)
//		{
//		System.out.println("count");
//		count++;
		
	//}
		String str= "we have a large inventory of things in our warehouse falling in"+
	"the category:apparel and the slightly "
    +"more in demand category:makeup along with the category:furniture and...";
		
		Print(str);
	}
	public static void Print(String string) {
		
		
		//while(True) {
//		int ind=string.indexOf("apparel");
//		int ind2=string.lastIndexOf("apparel");
//		String extstr1=string.substring(ind,ind2);
//			
//		System.out.println(extstr1);
//		}
//		}
		
	//}
	
	
		int i=0;
		while(true) {
			int found=string.indexOf("category:", i);
			if(found== -1) break;
			int start= found+9;//start of actual string
			int end=string.indexOf(" " ,start);
			System.out.println(string.substring(start, end));
			i= end+1;
		}
	}
	}
