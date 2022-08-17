//WJP for Non Synchronized withdraw operation from the shared bank account
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
