class CommandLineArgs 
{
	public static void main(String[] args) 
	{
		for (int i=0;i<args.length ;i++ )
		{
			System.out.println( "args[ " + i +" ]" + args[i] );
			
		}
		String eno=args[0];
		String ename=args[1];
		String eaddr=args[2];
		System.out.println(eno+"\n"+ename+"\n"+eaddr);
		}
}
