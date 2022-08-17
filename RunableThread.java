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
