class ExceptionTest  
{
	public static void main(String[] args) 
	{
		try{
		int a=5, b=3;//reset b=0 and run
		System.out.println("The result is "+(a/b));
		String s="@";
		 int i=Integer.parseInt(s);	//Parsing string object to int primitive
		System.out.println("Parsed string is"+i);
		}
		catch(ArithmeticException ae){
			System.out.println("Exception raised"+ae.getMessage());
		}
		catch(NumberFormatException nfe){
			nfe.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}

		try{
			int ar[]={10,20,30,40};
		System.out.println("Array elements are...");
		for(int e:ar)
			System.out.print("\t"+e);
		ar[3]=25;//change index to 4 or 5 then run again
		System.out.println("\n 3rd indexed element is"+ar[3]);
	 }
	  catch(ArrayIndexOutOfBoundsException aioobe){
	   	aioobe.printStackTrace();
	 }
	 catch(IndexOutOfBoundsException ioobe){
	   	ioobe.printStackTrace();
	 }
	 finally{
		System.out.println("At last i have reached to finally block");
	 }
}
}