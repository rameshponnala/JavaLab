//67 Java Program to demostrate ArrayList
import java.util.List;
import java.util.ArrayList;
class ArrayListDemo {
	public static void main(String args[]) {
		// create an array list
		List al = new ArrayList();
		System.out.println("Initial size of al: " +al.size());
		// add elements to the array list
		al.add("Rams");
		al.add("MCA");
		al.add("CBIT");
		al.add("Hyd");
		al.add(1, Integer.valueOf(1290));
		al.add(Double.valueOf(15000));
		System.out.println("Size of al after adding elements: " + al.size());
		// display the array list
		System.out.println("Contents of array list are: " + al);
		// Remove elements from the array list
		al.remove("Hyd");
		al.remove(2);
		System.out.println("Size of al after deletions: " + al.size());
		System.out.println("Contents of al: " + al);

	}
}
