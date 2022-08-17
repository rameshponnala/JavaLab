class StringDemo 
{
	public static void main(String[] args) 
	{
		//Empty
		String s=new String();
		System.out.println(" s: "+s);

		//Character array as input
		char ch[]={'r','a','m','s'};
		String charStr=new String(ch);
		System.out.println(" Char array based: "+charStr);
	
		String charStr2=new String(ch,1,2);
		System.out.println(" Char array based range: "+charStr2);
		String str2=new String(charStr);
		System.out.println(" String as input : "+str2);
		byte [] b={65,66,67,68,69};
		String byteStr=new String(b);
		System.out.println(" Byte array based: "+byteStr);
		String byteStr2=new String(b,2,2);
		System.out.println(" Byte array based: "+byteStr2);
		String name="RamsIT";//String Literal
		System.out.println("The length of the string literal is :" +name.length());
		String primType=String.valueOf(123);
		System.out.println("primitive type string :"+primType);
		int i=12345;
		String istr=String.valueOf(i);
		System.out.println("int i  as toString"+istr.toString());
		
		String concatStr= name+ i;
		System.out.println("concatinated Str :"+ concatStr);

		String name1="Rams";
		String name2="Rams";
	
		System.out.println("  String Pooling");
		System.out.println("String name1 hashCode :"+name1.hashCode());
		System.out.println("String name2 hashCode :"+name2.hashCode());


		String s3=new String("Rams");
		System.out.println("name2 :"+name1.hashCode());
		System.out.println("s3 :"+s3.hashCode());


		System.out.println("String name1 identityhashCode :"+System.identityHashCode(name1));
		System.out.println("String s3 identityhashCode :"+System.identityHashCode(s3));
        
		System.out.println(" Operator ==  compares two string addresses");
		System.out.println("Name1 Vs Name2: "+(name1==name2));
		System.out.println("Name1 Vs s3: "+(name1==s3));

		
		System.out.println(" equals()  compares two strings based on content");
		System.out.println("Name1 Vs Name2: "+name1.equals(name2));
		System.out.println("Name1 Vs s3: "+name1.equals(s3));

		System.out.println("\"Rams\".charAt(2) :"+s3.charAt(2));
		char ns[]=s3.toCharArray();
		System.out.println(ns);
		

		String nam="This  is Ramesh Ponnala handling java";
		String newname=nam.replace("a","n");
		System.out.println(newname);

		String newname2=nam.replaceFirst("a","n");
		System.out.println(newname2);

		String newname3=nam.replaceAll("a","n");
		System.out.println(newname3);



	}
}
