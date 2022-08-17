// Java code to illustrate methods of StringBuilder

public class BuilderDemo {
	public static void main(String[] argv)
		throws Exception
	{

		// create a StringBuilder object
		// with a String pass as parameter
		StringBuilder str
			= new StringBuilder("RamsIT");

		// print string
		System.out.println("String = "
						+ str.toString());

		// reverse the string
		//StringBuilder reverseStr = 
			str.reverse();
			System.out.println("Rev String = "+ str);
		
		
		// Append ', '(97) to the String
		str.appendCodePoint(97);

		// Print the modified String
		System.out.println("Modified StringBuilder = "
						+ str);

		// get capacity
		int capacity = str.capacity();

		// print the result
		System.out.println("StringBuilder = " + str);
		System.out.println("Capacity of StringBuilder = "
						+ capacity);
	}
}
