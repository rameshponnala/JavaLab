enum Apple{
	Jonathan(10), GoldenDel(9),RedDel(15),Cortland;
	private int price;
	Apple(){
		this.price=-1;
	}
	Apple(int p){
		this.price=p;
	}
	int getPrice(){
		return price;
	}
}

class  EnumDemo
{
	public static void main(String[] args) 
	{
		Apple ap;

		ap=Apple.valueOf("GoldenDel");

		System.out.println("GoldenDel AP costs :"+ap.getPrice());

		System.out.println("All Values from Apple Enum are \n");
		for (Apple a:Apple.values() )
		{
			System.out.println( "cost of " + a + " is :"+a.getPrice()); 
		}
	}
}
