//71 Java Program to create a list of Employees Info using ArrayList
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class EmployeeInfo
{
	private int eno;
	private String ename;
	private String address;

	public EmployeeInfo(){
		eno=0;
		ename=null;
		address=null;
	}
	
	public EmployeeInfo(int eno, String ename, String address){
		this.eno=eno;
		this.ename=ename;
		this.address=address;
	}
	
	@Override
	public String toString(){
		return " Employee [ eno: "+eno + " ename: " +ename + " address: "+address+ "]";
	}

}

public class  EmployeeList
{
	public static void main(String[] args) 
	{
		List<EmployeeInfo> elist=new ArrayList<EmployeeInfo>();
		
		EmployeeInfo e1=new EmployeeInfo(1290,"Rams","Hyderabad");
		EmployeeInfo e2=new EmployeeInfo(11215,"Ramesh", "Karimnagar");
		EmployeeInfo e3=new EmployeeInfo(12345,"Raja", "Sircilla");
		EmployeeInfo e4=new EmployeeInfo();
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);

		Iterator<EmployeeInfo> iterEmp=elist.iterator();
		while(iterEmp.hasNext()) {
				EmployeeInfo emp =(EmployeeInfo) iterEmp.next();
				System.out.println(emp);
			}
		
	}
}
