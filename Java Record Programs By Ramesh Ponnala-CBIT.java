//20.	Write a Java program to demonstrate 2-D jagged array.
import java.util.Scanner;
public class JaggedArray{
    public static void main(String [] args){
         int [ ][ ] twodim_array =new  int[ 3][];
         Scanner sc=new Scanner(System.in);
        //Declaring Column sizes of Jagged Array
        twodim_array[0]=new int[3];
         twodim_array[1]=new int[5];
         twodim_array[2]=new int[2];

         //Read Elements
         for(int i=0;i<3;i++){
	for(int j=0;j<twodim_array[i].length;j++){
                         System.out.println("Enter "+ i+ " "+ j+ "element");
                         twodim_array [i][j]=sc.nextInt();
                   }
         }
        //Display Jagged Array Elements
         System.out.println(" Two Dimensional Jagged Array elements are...");
         for(int i=0;i<3;i++){
	for(int j=0;j<twodim_array[i].length;j++){
                         System.out.print("\t"+ twodim_array [i][j]);
                   }
	System.out.println("\n\n");
         }
   }}

               
//21.	Write a Java program to find the factorial of a given number using recursion function.
import java.util.Scanner;
public class Factorial
{	
	static int a;
	public static int factorial(int n)
	{
		if(n==1||n==0)
		{
			return 1;
		}
			else
		{
				return n*factorial(n-1);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int f;
		System.out.println("enter number");
		a=sc.nextInt();
		f=factorial(a);
		System.out.println("factorial value is"+f);
	}
}

//22.	Write a Java program to find the first n natural numbers using recursion function.
import java.util.Scanner;
public class RecSumOfNatural{
	public int sumofnaturals(int n){
		if (n==0 || n==1)
		{
			return n;
		}
		else
		{
			return n+sumofnaturals(n-1);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter any integer \n");
		n=sc.nextInt();
		RecSumOfNatural rs=new RecSumOfNatural();
		int f=rs.sumofnaturals(n);
		System.out.println("The sum of first "+n+ " naturals is " +f);
	}
}

//23.	Write a Java program to demonstrate a class and object student class
class Student
{
	private int m,p,c;
	private int tot;
	private double avg;

	public void setData(int m, int p, int c){
		this.m=m;
		this.p=p;
		this.c=c;
	}
	
	public void compute(){
	this.tot=(m+p+c);
	this.avg= tot / 3.0;
	}

	public void getData(){
			System.out.println(m +"  " + " " + p + "  "+  c );
			System.out.println("tot :" +tot +" avg:  "+avg );
	}
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.compute();
		s.getData();
		s.setData(68,72,50);
	    System.out.println("After setting subject marks...");
		s.compute();
		s.getData();
	}
}

//24.	Write a Java Program to demonstrate Constructor in class 
class StudentConstructor
{
	private int m,p,c;
	private int tot;
	private double avg;
	//Default Constructor
	StudentConstructor(){
	this.m=0;
	this.p=0;
	this.c=0;
	}
	public void setData(int m, int p, int c){
		this.m=m;
		this.p=p;
		this.c=c;
	}
	
	public void compute(){
	this.tot=(m+p+c);
	this.avg= tot / 3.0;
	}

	public void getData(){
			System.out.println(m +"  " + " " + p + "  "+  c );
			System.out.println("tot :" +tot +" avg:  "+avg );
	}
	public static void main(String[] args) 
	{
		StudentConstructor s=new StudentConstructor();
		s.compute();
		s.getData();
		s.setData(68,72,50);
	    System.out.println("After setting subject marks...");
		s.compute();
		s.getData();
	}
}


//25.	Write a Java Program to demonstrate Parameterized constructor in class
class StudentParamConstructor
{
	private int m,p,c;
	private int tot;
	private double avg;
	//Parameterized Constructor
	StudentParamConstructor(int m, int p, int c){
		this.m=m;
		this.p=p;
		this.c=c;
	}
	
	public void compute(){
	this.tot=(m+p+c);
	this.avg= tot / 3.0;
	}

	public void getData(){
			System.out.println(m +"  " + " " + p + "  "+  c );
			System.out.println("tot :" +tot +" avg:  "+avg );
	}
	public static void main(String[] args) 
	{
		StudentParamConstructor s=new StudentParamConstructor(86,90,80);
		s.compute();
		s.getData();
		
	}
}

//26.	Write a Java Program to pass object reference as parameter 
class Student
{
	private int m,p,c,tot;
	private double avg;
	Student(){
		System.out.println("Default constructor");
	}
	Student(int m, int p, int c){
		System.out.println("Parameterized constructor");
		this.m=m;
		this.p=p;
		this.c=c;
	}
	//Copy constructor passing Object as parameter
	Student(Student s){
			System.out.println("Using existing Object reference to initialize stud object data");
			this.m=s.m;
			this.p=s.p;
			this.c=s.c;
			this.tot=s.tot;
			this.avg=s.avg;
	}

	public void getData(){
			System.out.println(m +"  " + " " + p + "  "+  c );
			System.out.println("tot :" +tot +" avg:  "+avg );
	}
	public void compute(){
			this.tot=(m+p+c);
			this.avg= tot / 3.0;
	}
} 
class  MainStudent
{
	public static void main(String[] args) 
	{
			Student s=new Student();
			s.compute();
			s.getData();

			System.out.println("Student Param Constructor");
			Student st=new Student(68,72,50);
			st.compute();
			st.getData();

			Student stud=new Student(st);
			stud.getData();

	}
}

//27.	Write a Java program to display constructor overloading.
class Student
{
	private int m,p,c,tot;
	private double avg;
	Student(){
		System.out.println("Default constructor");
	}
	//Overloaded Constructor
	Student(int m, int p, int c){
		System.out.println("Overloaded Parameterized constructor");
		this.m=m;
		this.p=p;
		this.c=c;
	}
		
	public void getData(){
			System.out.println(m +"  " + " " + p + "  "+  c );
			System.out.println("tot :" +tot +" avg:  "+avg );
	}
	public void compute(){
			this.tot=(m+p+c);
			this.avg= tot / 3.0;
	}
} 
class  MainStudent
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.compute();
		s.getData();
	
		System.out.println("Student Param Constructor");
		Student st=new Student(68,72,50);
		st.compute();
		st.getData();
		
	}
}

//28.	Write a Java program for method overloading
class MethodOverLoad
{
	public void add(int i,int j)
	{
		System.out.println("The sum of two ints is"+(i+j));
	}
	public String add(String s1,String s2){
		return s1+s2;
	}
	public double add(double s1, double s2){
		return s1+s2;
	}
}
class  MethodOverLoadDemo
{
	public static void main(String[] args) 
	{
		MethodOverLoad mo=new MethodOverLoad();
		mo.add(20,25);
		System.out.println(mo.add("stop","talking"));
		System.out.println(mo.add(123.45,345.67));
	}
}

//29.	Write a Java program for Single inheritance.
class Box{
	  protected double l,w,h;
	  Box(){
		  l=-1;
		  w=-1;
		  h=-1;
	 }

	Box(double l,double w,double h){
		  this.l=l;
		  this.w=w;
		  this.h=h;
	 }
	 public void getDimensions(){

		System.out.println("The length: "+l);
        System.out.println("The width: "+w);
        System.out.println("The Height: "+h);
	 }
}
class Cube extends Box{
    Cube(){
		super();
    }
    Cube(double len){
		this.l=this.w=this.h=len;
    }
    public double volume(){
		System.out.println("Volume of Cube");
		return this.l*this.w*this.h;
    }
}
public class SingleInheritance{
    public static void main(String args[]){
        Box b=new Box();
        System.out.println("The dimensions of box are.." );
		b.getDimensions();

        Cube c=new Cube();
		System.out.println("The dimensions of Cube are.." );
		c.getDimensions();
        System.out.println("The volume using default values :"+c.volume());

        Cube c1=new Cube(5);
		System.out.println("The dimensions of Cube are.." );
		c1.getDimensions();
        System.out.println("The volume using value :"+c1.volume());

       }
}

//30.	Write a Java program for Multilevel inheritance.
//Multilevel Inheritance
class Box{
	  protected double l,w,h;
	  Box(){
		  l=-1;
		  w=-1;
		  h=-1;
	 }

	Box(double l,double w,double h){
		  this.l=l;
		  this.w=w;
		  this.h=h;
	 }
	 public void getDimensions(){

		System.out.println("The length: "+l);
        System.out.println("The width: "+w);
        System.out.println("The Height: "+h);
	 }
}
class Cube extends Box{
    Cube(){
		super();
    }
    Cube(double len){
		this.l=this.w=this.h=len;
    }
    public double volume(){
		System.out.println("Volume of Cube");
		return this.l*this.w*this.h;
    }
}
class Cuboid extends Cube
{
		Cuboid(){
			 super();
	   }
		Cuboid(double l,double w,double h){
			 this.l=l;
			 this.w=w;
			 this.h=h;
		}
		//Overridden Method
		 public double volume(){
			 System.out.println("Volume of Cuboid");
		return this.l*this.w*this.h;
    }
}

public class MultilevelInheritance{
    public static void main(String args[]){
        Box b=new Box();
        System.out.println("The dimensions of box are.." );
		b.getDimensions();

        Cube c=new Cube();
		System.out.println("The dimensions of Cube are.." );
		c.getDimensions();
        System.out.println("The volume using default values :"+c.volume());

        Cube c1=new Cube(5);
		System.out.println("The dimensions of Cube are.." );
		c1.getDimensions();
        System.out.println("The volume using value :"+c1.volume());

		Cuboid cb=new Cuboid(2,3,5);
		System.out.println("The dimensions of Cuboid are.." );
		cb.getDimensions();
		System.out.println("The volume of cuboid is :"+cb.volume());
       }
}


//31.	Write a Java program for Hierarchical inheritance.
//Hierarchical Inheritance
class Box{
	  protected double l,w,h;
	  Box(){
		  l=-1;
		  w=-1;
		  h=-1;
	 }

	Box(double l,double w,double h){
		  this.l=l;
		  this.w=w;
		  this.h=h;
	 }
	 public void getDimensions(){

		System.out.println("The length: "+l);
        System.out.println("The width: "+w);
        System.out.println("The Height: "+h);
	 }
	 public double volume(){
		 return 0.0;
	 }
}
class Cube extends Box{
    Cube(){
		super();
    }
    Cube(double len){
		this.l=this.w=this.h=len;
    }
    public double volume(){
		System.out.println("Volume of Cube");
		return this.l*this.w*this.h;
    }
}
class Cuboid extends Box
{
		Cuboid(){
			 super();
	   }
		Cuboid(double l,double w,double h){
			 this.l=l;
			 this.w=w;
			 this.h=h;
		}
		//Overridden Method
		 public double volume(){
			 System.out.println("Volume of Cuboid");
		return this.l*this.w*this.h;
    }
}

public class HierarchicalInheritance{
    public static void main(String args[]){
        Box b=new Box();
        System.out.println("The dimensions of box are.." );
		b.getDimensions();
		System.out.println("Box Volume method... "+b.volume());

        Cube c=new Cube();
		System.out.println("The dimensions of Cube are.." );
		c.getDimensions();
        System.out.println("The volume using default values :"+c.volume());

        Cube c1=new Cube(5);
		System.out.println("The dimensions of Cube are.." );
		c1.getDimensions();
        System.out.println("The volume using value :"+c1.volume());

		Cuboid cb=new Cuboid(2,3,5);
		System.out.println("The dimensions of Cuboid are.." );
		cb.getDimensions();
		System.out.println("The volume of cuboid is :"+cb.volume());
       }
}

//32.	Write a Java program for method overriding.
class Super
{
	Super(){
		System.out.println("Super Class Constructor");
	}
	public void display(){
		System.out.println("Super class display method");
	}
}
class Sub extends Super
{
	sub(){
		System.out.println("sub class cnstructor");
	}
	//Overriden Method
	public void display(){
		System.out.println("Sub class overriden display method");
	}
}
public class MethodOverride
{
	public static void main(String []args){
		Sub s=new Sub();
		s.display();
	}
}

//33.	Write a Java program to demonstrate abstract classes.
abstract class MyAbstract
{
	public void show(){
		System.out.println("Concrete Show Method from MyAbstract");
    }
	public abstract void disp();
	public abstract void message();
	
}
class MyAbstractImpl extends MyAbstract
{
	public  void disp(){
		System.out.println("Implemented Disp method");
	}
	public  void message(){
		System.out.println("Welcome to Abstract Class Implementor");
	}
}
class AbstractDemo
{

	public static void main(String[] args) 
	{
		MyAbstractImpl m=new MyAbstractImpl();
		m.show();
		m.disp();
		m.message();
		//Abstract Class variable referencing to its sub class obj
		MyAbstract ma=new MyAbstractImpl();
		System.out.println("Using Reference Variable");
		ma.show();
		ma.disp();
		ma.message();
	}
}

//34.	Write a Java program to implement interface.
//Program to demonstrate Interface
interface MyInter
{
	int MAX=10;
	void show();
	 public abstract String message();
}
class MyInterImpl implements MyInter
{
	public void show(){
		System.out.println("MAX :"+MAX);//MAX can't be modified as it is final variable
		System.out.println("Implemented Show method");
	}
	public String message(){
		System.out.println("Implemented message method");
		return "Welcome to Interfaces";
	}
}
public class InterfaceDemo
{
	public static void main(String[] args) 
	{
		MyInterImpl mi=new MyInterImpl();
		mi.show();
		System.out.println("Message : "+mi.message());
	}
}


//35.	Write a Java program to illustrate multiple inheritance using interfaces.
interface MyInter1
{
   	 int M=10;
	void disp();
}
interface MyInter2 
{
   	 int MAX=100;
	public abstract void show();
}
class MultiInterfaces implements MyInter1,MyInter2
{
public void disp()
	{
		System.out.println("Disp method");
	}
		public void show()
	{
		System.out.println("show method");
	}
 
}
public class  MultipleInterface
{
	public static void main(String[] args) 
	{
		MultiInterfaces  mi=new MultiInterfaces();
		mi.disp();
		mi.show();
	}
}

//36.	Write a Java program to display final keyword at variable level.
class Sample{
			private final int count = 10;
			public void setCount(int count)
			{
				this.count = count; // Compiler give an error final variable can not be updated
			}

			public int getCount()
			{
				return count;
			}

}

public class FinalVarEx
	{
		public static void main(String args[])
		{
			Sample s = new Sample();
			System.out.println(" Count :: "+s.getCount());
		}
}

//37.	Write a Java program to display final keyword at method level.
class Super
{
	public final void show(){
		System.out.println("Final Show Method");
	}
}
class Sub extends Super
{
	//Override final method
	public void show(){
		System.out.println("Overriden Method");
	}
}
public class  FinalAtMethod 
{
	public static void main(String[] args) 
	{
		Super sp=new Super();
		System.out.println("Super Class Method Invocation");
		sp.show();
		Sub s=new Sub();
		System.out.println("Sub Class Method Invocation which gives error");
		s.show();
	}
}

//38.	Write a Java program to display final keyword at class level.
final class Parent
{
	private String name = "Ramesh Ponnala";

	public String getName()
	{
		return name;
	}
}

class Child extends Parent
{

}

public class FinalClassEx
{
	public static void main(String args[])
	{
		Parent p = new Child();
		System.out.println(" Name :: "+p.getName());

	}
}

//39.	Write a Java program to create a package and use it in another Java program using import statement.
//MyDemoPack.java
package mypack;
public class MyDemoPack
{
	public  void disp(){
		System.out.println("MyDemoPack disp Method");
	}
}
//To Compile:
//c:>javac -d . MyDemoPack.java

package mypack;
public class MyClass
{
	public void show(){
		System.out.println("MyClass Show Method");
	}
	public String message(){
		System.out.println("MyCLass Message Method");
		return "Welcome Friend";
	}
}
//To Compile:
//c:>javac -d . MyClass.java
//MyPackDemo.java with main method to use mypack classes  
import mypack.MyClass;
import mypack.MyDemoPack;
class MyPackDemo 
{
	public static void main(String[] args) 
	{
		MyClass m=new MyClass();
		m.show();
		System.out.println(m.message());
		MyDemoPack md=new  MyDemoPack();
		md.disp();
	}
}
//Comple using javac MyPackDemo.java

//40.	Write a Java program to demonstrate exception handling mechanism using try catch and finally blocks.
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

//41.	Write a Java program to demonstrate throw keyword.
class ThrowExample
{
	public void division(int a, int b){
		if(b<=0)
			throw new ArithmeticException();
		else
			System.out.println("Result is "+(a/b));
	 }
}
public class ThrowDemo{
	public static void main(String[] args) 
	{
		ThrowExample te=new ThrowExample();
		try{
			te.division(15,0);	
		}
		catch(ArithmeticException ae){
			System.out.println("Please change the value of b as non zero");
		}
	}
}

//42.	Write a Java program to demonstrate throws keyword.
class ThrowsExample
{
	public void division() throws ArithmeticException{
		int a=7,b=8;
		System.out.println("The result is "+(a/b));
	}
	public void array() throws ArrayIndexOutOfBoundsException{
		int a[]={1,2,3,4,5};
		System.out.println("a[5] is" +a[5]);
	}
}
public class ThrowsDemo 
{
	public static void main(String[] args) 
	{
		ThrowsExample te=new ThrowsExample();
		try{
			te.division();
			te.array();
		}
		
		catch(ArithmeticException ae){
		  System.out.println(ae.getMessage());
		  ae.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException aioobe){
			System.out.println(aioobe.getMessage());
		}
	}
}

//43.	Write a Java program to define user-defined Exception.
//UserDefinedException.java
class Employee
{
	private int bal=0;
	Employee(int bal){
	  this.bal=bal;
	}
	public  void withdraw(int amt) throws MinimumBalanceException {
		if (bal>=0 && amt<=bal)
		{
			System.out.println("You can withdraw amount "+amt);
		}
		else
			 throw new MinimumBalanceException("Please maintain min balance in your account");
	}
}
public class UserDefinedException 
{
	public static void main(String[] args) 
	{
		Employee s=new Employee(10000);
		try{
			  s.withdraw(100000);
		}
		catch(MinimumBalanceException mbe){
			System.out.println(mbe.getMessage());
		}
	}
}

//44.	Write a Java program to demonstrate Inner class
class MyOuter{
 private int x=7;
    class MyInner{
		public void innerMethod(){
			 System.out.println("Outer x is"+x);
		   }
    }//close for inner
}//close for outer
public class InnerClassTest{
	public static void main(String[] arg){
		//MyOuter mo=new MyOuter();
			//MyOuter.MyInner inner=mo.new MyInner();
			// above two lines can be written as follows in single line
			MyOuter.MyInner inner=new MyOuter().new MyInner();
			inner.innerMethod();
	}
}
			
//45.	Write a Java program to demonstrate method level Inner class
class MyOuter{
	private int x=5;
	public void methodLocal(){
		class MyInner{
			public void innerMethod(){
				 System.out.println("Outer x is"+x);
			   }
		}
		MyInner inner=new MyInner();
		inner.innerMethod();
    }
}
public class MethodInnerClass
{
	public static void main(String[] arg)
	{
		MyOuter mo=new MyOuter();
		mo.methodLocal();
	}
}
//46.	Write a to demonstrate Anonymous inner class with interface implementation

// Interface
interface Age {
	int x = 21;
	void getAge();
}

// Main class
class AnonymousClassInterface {

	public static void main(String[] args)
	{

		// My class is hidden inner class of Age interface implementor whose name is not written but an object to it is created.
		Age obj = new Age() {
		
			public void getAge()
			{
				System.out.print("Age is " + x);
			}
		};
	
		obj.getAge();
	}
}

//47.	Write a Java program to demonstrate Static nested class

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

//48.	Write a Java program to demonstrate command line arguments
class CommandLineArgs 
{
	public static void main(String[] args) 
	{
		for (int i=0;i<args.length ;i++ )
		{
			System.out.println( "args[ " + i +" ]" + args[i] );
			
		}
		String eno=args[0];
		String ename=args[1];
		String eaddr=args[2];
		System.out.println(eno+"\n"+ename+"\n"+eaddr);
		}
}

//To run: 
//c:>java CommandLineArgs 1290 RameshPonnala Hyderabad

//49.	Write a Java program to demonstrate multithreading by extending thread class.

public class  MyThread extends Thread
{
	MyThread(){
		super();
	}
	MyThread(String s)
	{
		super(s);
	}
	public void run(){
		System.out.println("MyClass Run method"+Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		//System.out.println(Thread.currentThread.getName() + " : "+Thread.currentThread().getPriority());
		MyThread m=new MyThread();
		m.start();
		System.out.println("Hello World! from Main Thread");
		MyThread m1=new MyThread("MyThread-1");
		MyThread m2=new MyThread("MyThread-2");
		m1.start();
		m2.start();
	}
}

//50.	Write a Java program to demonstrate multithreading by Implementing Runnable Interface.
class MyThread1 implements Runnable
{
String s=null;
MyThread1(String s1){
s=s1;
}
public void run()
{
System.out.println(s);
for(int i=1;i<=10;i++)
{
System.out.println("It is from thread a :i="+i);
}
System.out.println("End of thread a");
}
}
public class RunableThread
{
	public static void main(String args[])
	{
		MyThread1 m1=new MyThread1("Thread started....");
		Thread t1=new Thread(m1);
		t1.start();
		System.out.println("Main Thread");
	}
}

//51.	Write a Java program to create even and odd thread classes by extending thread class.

class Even extends Thread
{
	public void run()
	{
		for(int i=2;i<10;i+=2)
		{
			System.out.println("It is from thread Even :i="+i);
		}
		System.out.println("End of thread Even");
	}
}
class Odd extends Thread
{
	public void run()
	{
		for(int j=1;j<=10;j+=2)
		{
		System.out.println("It is from thread Odd:j="+j);
		}
		System.out.println("End of thread Odd");
   }
}
public class MainThread
{
	public static void main(String arg[])
	{
		Even a=new Even();
		a.start();
		System.out.println("Main method");
		Odd b=new Odd();
		b.start();
        System.out.println("End of Main");
    }
}

//52.	Write a Java program for non – synchronized withdraw operation from the shared bank account
class BankAccount
{
	private double bal;
	BankAccount(){
		this.bal=0.0d;
	}
	BankAccount(double bal){
		this.bal=bal;
	}
	public double getBalance(){
		return this.bal;
	}
	public void withdraw(double amt){
		this.bal=this.bal-amt;
		System.out.println("Amount withdrawn is "+amt +" and the remaining bal is" + getBalance());
	}
}
class MyBankThread extends Thread{
	BankAccount bankAcc;
	MyBankThread(){
	super();
	}
	MyBankThread(String s, BankAccount ba){
		super(s);
		bankAcc=ba;
	}
	public void run(){
		System.out.println(this.getName());
		bankAcc.withdraw(15000);
	}
}
class  BankAccountThread 
{
	public static void main(String[] args) 
	{
		BankAccount bankAcc=new BankAccount(20000);

		MyBankThread wBank=new MyBankThread("Wife",bankAcc);
		wBank.start();
		MyBankThread hBank=new MyBankThread("Husband",bankAcc);
		hBank.start();
	}
}

//53.	Write a Java program for synchronized withdraw operation from the shared bank account.
class BankAccount
{
	private double bal;
	BankAccount(){
		this.bal=0.0d;
	}
	BankAccount(double bal){
		this.bal=bal;
	}
	public double getBalance(){
		return this.bal;
	}
	public synchronized void withdraw(double amt, Thread t){
		if (getBalance()<amt)
		{
			System.out.println(t.getName()+" No Sufficient Balance in your account..");
			return;
		}
		else{
			this.bal=this.bal-amt;
			System.out.println(t.getName()+"  withdrawn amount is "+amt +" and the remaining bal is" + getBalance());
		}
	}
}
class MyBankThread extends Thread{
	BankAccount bankAcc;
	MyBankThread(){
	super();
	}
	
	MyBankThread(BankAccount ba){
		bankAcc=ba;
	}

	MyBankThread(String s, BankAccount ba){
		super(s);
		bankAcc=ba;
	}
	public void run(){
		System.out.println(this.getName() + "Invoked withdraw Operation");
		for (int i=1;i<10;i++)
		{
			bankAcc.withdraw(5000,this);
		}
		
	}
}
class  SynchronizedBankAccountThread 
{
	public static void main(String[] args) 
	{
		BankAccount bankAcc=new BankAccount(50000);

		MyBankThread wBank=new MyBankThread(bankAcc);
		wBank.setName("Wife");
		wBank.start();
		MyBankThread hBank=new MyBankThread(bankAcc);
		hBank.setName("Husband");
		hBank.start();
		

	}
}

//54.	Write a Java program for synchronized block withdraw operation from the shared bank account
class BankAccount
{
	private double bal;
	BankAccount(){
		this.bal=0.0d;
	}
	BankAccount(double bal){
		this.bal=bal;
	}
	public double getBalance(){
		return this.bal;
	}
	public  void withdraw(double amt, Thread t){
		if (getBalance()<amt)
		{
			System.out.println(t.getName()+" No Sufficient Balance in your account..");
			return;
		}
		else{
			synchronized(this){
				this.bal=this.bal-amt;
				System.out.println(t.getName()+"  withdrawn amount is "+amt +" and the remaining bal is" + getBalance());
		  }
		}
	}
}
class MyBankThread extends Thread{
	BankAccount bankAcc;
	MyBankThread(){
	super();
	}
	
	MyBankThread(BankAccount ba){
		bankAcc=ba;
	}

	MyBankThread(String s, BankAccount ba){
		super(s);
		bankAcc=ba;
	}
	public void run(){
		System.out.println(this.getName() + "Invoked withdraw Operation");
		for (int i=1;i<10;i++)
		{
			bankAcc.withdraw(5000,this);
		}
		
	}
}
class  SynchronizedBlockBankAccountThread 
{
	public static void main(String[] args) 
	{
		BankAccount bankAcc=new BankAccount(50000);

		MyBankThread wBank=new MyBankThread(bankAcc);
		wBank.setName("Wife");
		wBank.start();
		MyBankThread hBank=new MyBankThread(bankAcc);
		hBank.setName("Husband");
		hBank.start();
	}
}

//55.	Write a Java program to demonstrate Strings in Java
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

//56.	Write a Java program to work with StringBuffer and its operations

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

//57.	Write a Java program to work with StringBuilder and its operations

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

//58.	Write a Java program to create an Enumeration and assign values using constructor
enum Apple{
	Jonathan(10), GoldenDel(9),RedDel(15),Conrtland(8);
	private int price;
	Apple(){
		this.price=-1;
	}
	Apple(int p){
		this.price=p;
	}
	int getPrice(){
		return price;
	}
}

class  EnumDemo
{
	public static void main(String[] args) 
	{
		Apple ap;
		ap=Apple.valueOf("GoldenDel");
		System.out.println("Winesap costs :"+ap.getPrice());
		System.out.println("All Values from Apple Enum are \n");
		for (Apple a:Apple.values() )
		{
			System.out.println( "cost of " + a + " is :"+a.getPrice()); 
		}
	}
}

//59. Java program to create file object and get its properties using file object
import java.io.File;
import java.io.IOException;
class  FileProperties
{
	public static void main(String[] args) 
	{
		File f=new File("D:/JavaLab/Annotations");//prefix D:/ for absolute path

		System.out.println("File Object is :"+ f.toString());
		System.out.println("File Name is :"+ f.getName());
		System.out.println("File path  is :"+ f.getPath());
		System.out.println("File abslute path  is :"+ f.getAbsolutePath());
		System.out.println("File parent  is :"+ f.getParent());
		System.out.print("File Exists :");
		System.out.println(f.exists() ? "Exists " : " Doesn't Exist");
		System.out.println("Is Directory ?: "+(f.isDirectory() ? " Yes " : " No"));
		System.out.println("Is writable  ?: " + (f.canWrite() ? " Writable " : " Not Writable"));
	    System.out.println("Is readable ?: " + (f.canRead() ? " Readable " : " Not Readable"));
		System.out.println("Is File ?: "+(f.isFile() ? " Yes " : " No"));
		System.out.println("Is Absolute ?: "+(f.isAbsolute() ? " Yes " : " No"));
		System.out.println("Last Modified : "+ f.lastModified());
		System.out.println("Size of the File : "+ f.length() + " in bytes");
		String listOfFiles[]=f.list();
		System.out.println(" \n List of Files in " +f.getName() + " Directory are...\n " );
		for (String fileName: listOfFiles)
		{
			System.out.println( fileName);
		}
		//It generates array of file objects
		File files[]=f.listFiles();
		System.out.println(" \n List of Files in " +f.getName() + " Directory are...\n " );
		for (File fileObj: files)
		{
			System.out.println( (fileObj.isFile()) ? ( "It is file named "+fileObj.getName() ) : (" It is directory named "+ fileObj.getName() ));
		}

		//Create a new File
		File newFile= new File("mcaclass.txt");
		try{
		System.out.println("\n "+ newFile.getName() + " File created : " +(newFile.createNewFile()));
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		//Create directory
		File dir= new File("MCAIIsem");
		System.out.println(dir.getName() + " Directory created : " +(dir.mkdir()));
	}
}

//60 Java Program to display list of file names with specified extension using FilenameFilter
import java.io.FilenameFilter;
import java.io.File;

class ExtensionFilter 
{
	public static void main(String[] args) 
	{
		File dir=new File("D:/JavaLab/Annotations");
		
		String javaFiles[]= dir.list(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.toLowerCase().endsWith(".java");
				}
				});

		for(String file: javaFiles)
			System.out.println( file);
	}
}

//61 Java Program illustrating the Byte Stream to copy contents of one file to another file.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileCopyUsingByteStream {
	public static void main(	String[] args)	{

		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;

		try {
			sourceStream
				= new FileInputStream("D:/JavaLab/Annotations/AnnotationsNotes.txt");
			targetStream
				= new FileOutputStream("notes.txt");

			// Reading source file and writing content to target file byte by byte
			int temp;
			while ( (temp = sourceStream.read())	!=  -1)
				targetStream.write((byte)temp);
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		finally {
			try{
			if (sourceStream != null)
				sourceStream.close();
			if (targetStream != null)
				targetStream.close();
			}
			catch(IOException e){e.printStackTrace();}
		}
	}
}

//62 Java Program illustrating the Character Stream to copy contents of one file to another file.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyUsingCharStream {
	public static void main(	String[] args)	{
		FileReader sourceStream = null;
		FileWriter targetStream=null;
		try {
			sourceStream	= new FileReader("Student.java");
			targetStream	= new FileWriter("charTargetFile.txt");
			// Reading sourcefile and writing content to target file character by character.
			int temp=-1;
			while ( (temp = sourceStream.read()) !=  -1)
				targetStream.write(temp);//writes onto file
			}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		finally {
			try{
			if (sourceStream != null)
				sourceStream.close();
			if (targetStream != null)
				targetStream.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

//63 Java program to read the file content and display using BufferedInputStream
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class BufferedInputStreamApp{
	public static void main(String args[])
	{	
			InputStream fin=null;
			BufferedInputStream bufin=null;
			try
			{
				fin= new FileInputStream("FinalVarEx.java");
				//give existing file name
				bufin = new BufferedInputStream(fin);
				int i;
				while( (i = bufin.read()) != -1)
				{
					System.out.print((char)i);
				}
				
			}
			catch(IOException exp){
				System.out.println(" Exception Raised ::"+exp);
			}
			finally{
				try{
					bufin.close();
					fin.close();
				}
				catch(Exception e){e.printStackTrace();}
			}
	}
}

//64 Java program to write the content onto file using BufferedOutputStream
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOutputStreamApp
{
	public static void main(String args[])
	{	
		OutputStream os=null;
		BufferedOutputStream bos=null;

		try
		{
			String msg = " Hi Lets do work with BufferedOutputStream 8/11/2022";
			os = new FileOutputStream("demo.txt");
			bos = new BufferedOutputStream(os);
			byte[] msgArr = msg.getBytes();
			bos.write(msgArr);
			System.out.println(" Data Transfer done to a file");
		}
		catch(IOException exp)
		{
				System.out.println(" Exception Raised ::"+exp);
			}
			finally{
				try{
				bos.flush();
				bos.close();
				os.close();
			}catch(Exception e){e.printStackTrace();}
		}
	}
}

//65 Java program to read and write from file using BufferedReader and BufferedWriter
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;

import java.util.Scanner;

public class FileBufferRead
{
   public static void main(String [] args) throws IOException
   {

	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter source file name");
	   String sourceFile=s.next();

	   System.out.println("Enter target file name");
	   String targetFile=s.next();

	   File inFile  = new File(sourceFile);
	   File outFile = new File(targetFile);	

	   FileReader fr = new FileReader( inFile );
	   BufferedReader br = new BufferedReader( fr );

	   FileWriter fw = new FileWriter( outFile );
	   BufferedWriter bw = new BufferedWriter( fw );	

	   String temp = null;
       boolean keepReading = true;
	
	   while( keepReading )
	   {
		temp = br.readLine();
		if( temp == null) 
		{
		   keepReading = false;
		}
		else
		{ 
		   bw.write( temp );
		}
	   }

	   System.out.println("File Written succesfully into "+ targetFile.getName());
	   br.close();
	   fr.close();
	   bw.close();
	   fw.close();
  	}
}

//66 Java program to demonstrate serialiazation and deserialization
import java.io.Serializable;

import java.io.FileOutputStream;
import java.io.FileInputStream;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

import java.io.IOException;

class Employee implements Serializable 
{
	private int id;
	private String name;
    transient String address;// this variable can't be serializable
	private double sal;
	
	Employee(){
	System.out.println("No-arg constructor");
	}
	Employee(int id,String name, String address, double sal){
	this.id=id;
	this.name=name;
	this.address=address;
	this.sal=sal;
	}
	
	public void disp(){
	System.out.println("The id is"+id+"\n The name is"+name+"\n The salary is "+sal);
	System.out.println("The transient variable address is : "+address);
	}

}

public class SerialzeObject 
{
	public static void main(String[] args)  throws IOException,ClassNotFoundException
	{

	Employee e=new Employee(1290,"rams","Hyderabad",25000);
	
	//To Serialize:
	FileOutputStream fos=new FileOutputStream("serialfile.txt");
	ObjectOutputStream oos=new  ObjectOutputStream(fos);
	oos.writeObject(e);
	System.out.println("The object is serialized");

	//To Deserialize:
	System.out.println("Deserializing......\n");
	FileInputStream fis=new FileInputStream("serialfile.dat");
	ObjectInputStream ois=new  ObjectInputStream(fis);
	
	//Object obj=ois.readObject();
	//Employee obj=(Employee)obj;

		Employee obj=(Employee)ois.readObject();

		obj.disp();

		}
}

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

//70 Java Program to convert an ArrayList into an array.
import java.util.*;
class ArrayListToArray {
		public static void main(String args[]) {
			// Create an array list
			ArrayList<Integer> al = new ArrayList<>();
			// Add elements to the array list
			al.add( Integer.valueOf(10));
			al.add(  Integer.valueOf(20));
			al.add( Integer.valueOf(30));
			al.add( Integer.valueOf(40));
			System.out.println("Contents of al: " + al);
			// get array
			Object ia[] = al.toArray();
			int sum = 0;
			// sum the array
			for(int i=0; i<ia.length; i++)
			sum += ( (Integer)ia[i]).intValue();
			System.out.println("Sum is: " + sum);
		}
}

//71 Java Program to create a list of Employees Info using ArrayList
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class EmployeeInfo
{
	private int eno;
	private String ename;
	private String address;

	public EmployeeInfo(){
		eno=0;
		ename=null;
		address=null;
	}
	
	public EmployeeInfo(int eno, String ename, String address){
		this.eno=eno;
		this.ename=ename;
		this.address=address;
	}
	
	@Override
	public String toString(){
		return " Employee [ eno: "+eno + " ename: " +ename + " address: "+address+ "]";
	}

}

public class  EmployeeList
{
	public static void main(String[] args) 
	{
		List<EmployeeInfo> elist=new ArrayList<EmployeeInfo>();
		
		EmployeeInfo e1=new EmployeeInfo(1290,"Rams","Hyderabad");
		EmployeeInfo e2=new EmployeeInfo(11215,"Ramesh", "Karimnagar");
		EmployeeInfo e3=new EmployeeInfo(12345,"Raja", "Sircilla");
		EmployeeInfo e4=new EmployeeInfo();
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);

		Iterator<EmployeeInfo> iterEmp=elist.iterator();
		while(iterEmp.hasNext()) {
				EmployeeInfo emp =(EmployeeInfo) iterEmp.next();
				System.out.println(emp);
			}
		
	}
}




