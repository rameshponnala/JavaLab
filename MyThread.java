//Program to demostrate Multithreading by extending Thread class
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
