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