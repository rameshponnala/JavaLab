//Java program to write the content onto file using BufferedOutputStream
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOutputStreamApp
{
	public static void main(String args[])
	{	
		OutputStream os=null;
		BufferedOutputStream bos=null;

		try
		{
			String msg = " Hi Lets do work with BufferedOutputStream 8/13/2022";
			os = new FileOutputStream("mca.txt");
			bos = new BufferedOutputStream(os);
			byte[] msgArr = msg.getBytes();
			bos.write(msgArr);
			System.out.println(" Data Transfer done to a file");
		}
		catch(IOException exp)
		{
				System.out.println(" Exception Raised ::"+exp);
			}
			finally{
				try{
				bos.flush();
				bos.close();
				os.close();
			}catch(Exception e){e.printStackTrace();}
		}
	}
}


