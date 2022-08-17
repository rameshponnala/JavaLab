//Program to demonstrate thread priority
class MyThread1 extends Thread{
	MyThread1(String s){
		super(s);
		start();
	}
	public void run(){
		for(int i=0;i<3;i++){
			Thread cur=Thread.currentThread();
			cur.setPriority(2);
			int p=cur.getPriority();
			System.out.println("Thread Name :"+cur.getName() + "Thread Priority :" +cur.getPriority());
		}
	}
}
class MyThread2 extends Thread{
	   MyThread2(String s){
			super(s);
			start();
		}
		public void run(){
			for(int i=0;i<3;i++){
			Thread cur=Thread.currentThread();
			cur.setPriority(Thread.MAX_PRIORITY);
			int p=cur.getPriority();
			System.out.println("Thread Name :"+cur.getName() + "Thread Priority :" +cur.getPriority());
		}
	}
}
public class ThreadPriority{
	public static void main(String args[]){
		System.out.println("The available  Thread Priorities are"+ Thread.MIN_PRIORITY  + " "+ Thread.NORM_PRIORITY+"  "+ Thread.MAX_PRIORITY);
		MyThread1 m1=new MyThread1("My Thread 1");
		m1.setPriority(8);
		MyThread2 m2=new MyThread2("My Thread 2");
		MyThread2 m3=new MyThread2("NewThread");
	}
}