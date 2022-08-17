//Program to demstrate anonymous concrete class
class MyClass1{
	MyClass1(){
		System.out.println("MyClass1 constructor");
	}
	public void methodLocal()
	{
		System.out.println("MyClass1 method");
	}
}
class MyClass2
	{
		MyClass2(){
			System.out.println("MyClass2 constructor");
		}
	    MyClass1 m1=new MyClass1(){
			//Overriding methodLocal
			public void methodLocal()
			{
				System.out.println("This is anonymous methodLocal");
			}
		};
		void method2(){
			m1.methodLocal();
		}
}
public class AnonymousInnerClass{
	public static void main(String[] args){
		MyClass2 mo=new MyClass2();
		mo.method2();
	}
}