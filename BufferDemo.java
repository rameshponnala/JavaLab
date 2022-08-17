// Java Program to Illustrate StringBuffer class

class BufferDemo{

	public static void main(String[] args)
	{

		StringBuffer s = new StringBuffer("Chaitanya Bharathi");

		// Getting the length of the string
		int p = s.length();

		// Getting the capacity of the string
		int q = s.capacity();

		System.out.println("Length of string ="+ p);
		System.out.println("Capacity of string =" + q);
		//Append
		s.append(" Institute  Technology");
		System.out.println(s);
		
		s.insert(28, " of");
        System.out.println(s);

		s.reverse();
	    System.out.println(s);

		s.reverse();
	    System.out.println(s);


		s.delete(28, 32);
        
        System.out.println(s);
 
        s.deleteCharAt(7);
		System.out.println(s);

		StringBuffer str=new StringBuffer("Ramesh");
		str.replace(3,6,"Ponnala");
		System.out.println(str);
	}
}
