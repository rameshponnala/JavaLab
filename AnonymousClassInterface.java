// Java Program to Demonstrate Anonymous inner class with interface implementation

// Interface
interface Age {
	int x = 21;
	void getAge();
}

// Main class
class AnonymousClassInterface {

	public static void main(String[] args)
	{
		// My class is hidden inner class of Age interface implemntor
		// whose name is not written but an object to it is created.
		Age obj = new Age() {
		
			public void getAge()
			{
				System.out.print("Age is " + x);
			}
		};
	
		obj.getAge();
	}
}
