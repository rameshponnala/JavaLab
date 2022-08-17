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
