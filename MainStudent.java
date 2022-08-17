class Student
{
	private int m,p,c,tot;
	private double avg;
	Student(){
		System.out.println("Default constructor");
	}
	Student(int m, int p, int c){
		System.out.println("Parameterized constructor");
		this.m=m;
		this.p=p;
		this.c=c;
	}
	//Copy constructor passing Object as parameter
	Student(Student s){
	System.out.println("Using existing Object reference to initialize stud object data");
	this.m=s.m;
	this.p=s.p;
	this.c=s.c;
	this.tot=s.tot;
	this.avg=s.avg;
	}

	
	public void getData(){
			System.out.println(m +"  " + " " + p + "  "+  c );
			System.out.println("tot :" +tot +" avg:  "+avg );
	}
	public void compute(){
	this.tot=(m+p+c);
	this.avg= tot / 3.0;
	}
} 
class  MainStudent
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.compute();
		s.getData();
	System.out.println("Student Param Constructor");
	  Student st=new Student(68,72,50);
	  st.compute();
	  st.getData();

	  Student stud=new Student(st);
	  stud.getData();

	}
}
