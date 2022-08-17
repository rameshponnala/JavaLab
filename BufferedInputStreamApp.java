//Java program to read the file content and display using BufferedInputStream
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class BufferedInputStreamApp{
	public static void main(String args[])
	{	
			InputStream fin=null;
			BufferedInputStream bufin=null;
			try
			{
				fin= new FileInputStream("FinalVarEx.java");//give existing file name
				bufin = new BufferedInputStream(fin);
				int i;
				while( (i = bufin.read()) != -1)
				{
					System.out.print((char)i);
				}
				
			}
			catch(IOException exp){
				System.out.println(" Exception Raised ::"+exp);
			}
			finally{
				try{
					bufin.close();
					fin.close();
				}
				catch(Exception e){e.printStackTrace();}
			}
	}
}


