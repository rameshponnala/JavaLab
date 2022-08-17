//Program to demonstrate Method Level Inner Class
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