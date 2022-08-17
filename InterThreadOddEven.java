class PrintNumbers{
	private int n = 10;
	private volatile int i = 1;
	private volatile boolean isOdd = true;

	public synchronized void displayOdd()
	{
		while( i <= n)
		{
			if(isOdd)
			{
				System.out.println(Thread.currentThread().getName()+ " : "+i);
				i = i + 1;
				isOdd = false;
				notify();
				try
				{
				Thread.sleep(1000);
				}catch(Exception exp)
				  {
				System.out.println(exp);
				  }
			}
		else
			{
			try
			{
				wait();
			}catch(Exception exp)
			   {
					System.out.println(exp);
			   }
			}
		}
	}


	public synchronized void displayEven()
	{
			while( i <= n)
			{
				if(isOdd)
				{
				  try
				{
					wait();
				}catch(Exception exp)
					 {
						System.out.println(exp);
					 }
				}else
				{
					System.out.println( Thread.currentThread().getName()+" : "+i);
					i = i + 1;
					isOdd = true;
					notify();
					try
					{
					Thread.sleep(1000);
					}catch(Exception exp)
						{
							System.out.println(exp);
						}
					}
				}
			
		}

}

class OddThread extends Thread
{
	private PrintNumbers pnum ;

	public OddThread(PrintNumbers pnum)
	{
		this.pnum = pnum;
	}

	public void run()
	{
		pnum.displayOdd();
	}
}

class EvenThread extends Thread
{
	private PrintNumbers pnum ;

	public EvenThread(PrintNumbers pnum)
	{
		this.pnum = pnum;
	}

	public void run()
	{
		pnum.displayEven();
	}
}

class InterThreadOddEven
{
	public static void main(String args[])
	{
		PrintNumbers pnum = new PrintNumbers();

		OddThread  t1 = new OddThread(pnum);
		t1.setName(" ODD Thread ");
		t1.start();

		EvenThread  t2 = new EvenThread(pnum);
		t2.setName(" EVEN Thread");
		t2.start();
		
	}
}

