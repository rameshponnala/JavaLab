class StudentParamConstructor
{
	private int m,p,c;
	private int tot;
	private double avg;
	//Parameterized Constructor
	StudentParamConstructor(int m, int p, int c){
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
		StudentParamConstructor s=new StudentParamConstructor(86,90,80);
		s.compute();
		s.getData();
		
	}
}
