//68 Java Program to demonstrate Iterator and ListIterator.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
		public static void main(String args[]) {
			// create an array list
			ArrayList<Integer> al = new ArrayList<Integer>();
			// add elements to the array list
			al.add(10); //al.add(Integer.valueOf(10))
			al.add(20);  //al.add(Integer.valueOf(20))
			al.add(30);   //al.add(Integer.valueOf(30))
			al.add(40);  //al.add(Integer.valueOf(40))

			// use iterator to display contents of al
			System.out.print("Original contents of al using Iterator ");
			Iterator<Integer> itr = al.iterator();
			while(itr.hasNext()) {
				Object element = itr.next();
				System.out.print(element + " ");
			}

			ListIterator<Integer> litr = al.listIterator();
			System.out.print("\n\n Original contents of al using ListIterator ");
			while(litr.hasNext()) {
				Object element = litr.next();
				System.out.print(element + "  " );
			}

			// now, display the list backwards
			System.out.print("\n \nList elements in backward direction using ListIterator: ");
			while(litr.hasPrevious()) {
				Object element = litr.previous();
				System.out.print(element + " ");
			}
			System.out.println();
		}
}
