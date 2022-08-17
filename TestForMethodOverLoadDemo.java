class MethodOverLoad
{
	public void add(int i,int j)
	{
		System.out.println("The sum of two ints is"+(i+j));
	}
	public String add(String s1,String s2){
		return s1+s2;
	}
	public double add(double s1, double s2){
		return s1+s2;
	}
}
class  MethodOverLoadDemo
{
	public static void main(String[] args) 
	{
		MethodOverLoad mo=new MethodOverLoad();
		mo.add(20,25);
		System.out.println(mo.add("stop","talking"));
		System.out.println(mo.add(123.45,345.67));
	}
}
