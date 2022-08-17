//WJP for  Synchronized withdraw operation from the shared bank account
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
