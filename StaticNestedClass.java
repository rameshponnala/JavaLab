// Java Program to Illustrate Static Nested Classes
class Outer {
	   static class Inner {
			public  void display()
			{
				System.out.println("inside static inner class Method");
			}
	}
}
class StaticNestedClass {
	public static void main(String args[])
	{
		Outer.Inner obj = new Outer.Inner();
		// Calling method via above instance created
		obj.display();
	}
}
