public class EmployeeInfo
{
	private int eno;
	private String ename;
	private String address;

	public EmployeeInfo(){
	}
	
	public EmployeeInfo(int eno, String ename, String address){
		this.eno=eno;
		this.ename=ename;
		this.address=address;
	}
	
	@Override
	public String toString(){
		return " Employee [ eno: "+eno + "ename: " +ename + "address: "+address+ "]";
	}

}
