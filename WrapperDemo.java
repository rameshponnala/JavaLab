class  WrapperDemo
{
	public static void main(String[] args) 
	{
		int i=120;
		Integer b=new Integer(i);
		System.out.println(b);
		Integer b2=Integer.valueOf(123);
		System.out.println("Using valuOf() :" + b2);
	//auto boxing : Conversion of a primitive datatype value into Wrapper object automatically is called Auto Boxing
		 Integer b3=i; 
		 if (b3 instanceof Integer)
		 {
			 System.out.println("B3 is an object of Integer Class and the  value held is :" + b3);
		 }
		System.out.println("Integer Min range :"+b3.MIN_VALUE);
		System.out.println("Integer Max range :"+b3.MAX_VALUE);
		System.out.println("Integer Size :" +b3.SIZE);
		//Convert Integer into int type
		int ib=b3.intValue();
		System.out.println("Typecasted int is : "+ib);

		//Parsing String value into primitive Integer using static parseInteger(str) method
		Integer b4=Integer.parseInt("125");
		System.out.println("Parsed String equal Integer value : "+b4);

  //Auto-Unboxing: It is the process of conversion of Wrapper object to its primitive value 

      System.out.println(" b3.IntegerValue()"+b3.IntegerValue());

	  Integer b5=b3;
	  System.out.println("Unboxed Integer value is: "+b5);


    }
}

/*
1.
 obj.xxxValue() 
   It converts valueobj into primitive type
  where xxx-> Primitive data type like int float double...

Ex:Integer b=new Integer("10");			
Integer i=b.IntegerValue()
 
 2.
 WrapperClass.parseXxx(string)
	It converts string into primitive type and called using Class name as it is a static method
	 where Xxx-> Primitive data type with first character as upper case letter like Int,Float,Double...


	Integer a=Integer.parseInteger("25")
	int i=Integer.parseInt("05")*/

