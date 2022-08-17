// Java Program to demonstrate Use of @SuppressWarnings Annotation

import java.util.List;
import java.util.ArrayList;

class Addition {

	@Deprecated
	public static int sum(int n1, int n2)
	{
			return n1 + n2;
	}

	public static int sum(int... nums)
	{
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}

		return sum;
	}
}

public class AtSupressWarning {

	@SuppressWarnings("unchecked") //once you comment this  and compile
    public static void main(String[] args)
	{
		
		@SuppressWarnings("deprecation")
		int sum = Addition.sum(10, 20);
		System.out.println("Sum of 10 and 20 : " + sum);
		
		int sum2 = Addition.sum(10, 15,25);
		System.out.println("Sum of 10,15 and 25 : " + sum2);
		
		@SuppressWarnings("rawtypes")
		List list = new ArrayList();	
		list.add(12);
		list.add("rams");
		System.out.println("List items : " + list);
	}
}
