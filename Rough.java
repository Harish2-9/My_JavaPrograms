package practice;
import java.util.*;
public class Rough {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(9);
		li.add(2);
		li.add(1);
		li.add(3);
		li.add(7);
		li.add(5);
		for(Integer val : li) {
			System.out.print(val);
		}
		System.out.println();
		System.out.println("value at index 0 is " + li.get(0));
		

	}

}
