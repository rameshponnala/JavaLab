//70 Java Program to convert an ArrayList into an array.
import java.util.*;
class ArrayListToArray {
		public static void main(String args[]) {
			// Create an array list
			ArrayList<Integer> al = new ArrayList<>();
			// Add elements to the array list
			al.add( Integer.valueOf(10));
			al.add(  Integer.valueOf(20));
			al.add( Integer.valueOf(30));
			al.add( Integer.valueOf(40));
			System.out.println("Contents of al: " + al);
			// get array
			Object ia[] = al.toArray();
			int sum = 0;
			// sum the array
			for(int i=0; i<ia.length; i++)
			sum += ( (Integer)ia[i]).intValue();
			System.out.println("Sum is: " + sum);
		}
}