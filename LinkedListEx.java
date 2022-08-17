//69 Java Program to demostrate LinkedList
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListEx{

	public static void main(String args[])	{

		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Honey");
		list.add("Rishi");
		list.add("Rams");
		list.add(null);

		System.out.println(" Size of List "+list.size());
		System.out.println(" contains 12 =>"+list.contains(12));

		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("Srujana");
		list2.add("Ramesh");

		list.addAll(list2);
		list.addLast("Z");
		list.addFirst("A");

		System.out.println(" After adding Collection size "+list.size());

		System.out.println(" \n\n Iterating Elements through Iterator");

		Iterator<String> itr =	list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " >> ");
		}

		// remove first and last elements
		list.removeFirst();
		list.removeLast();

		System.out.println("\n LinkedList after deleting first and last: "+ list);

		// get and set a value
		Object val = list.get(2);
		list.set(2, (String) val + " Ponnala");
		System.out.println("\n Linked list after change: " + list);

		System.out.println(" \n\n Iterating Elements through Enhanced For loop");

		for(String e:list)
		{
			System.out.print(e + " >> ");
		}
	}

}