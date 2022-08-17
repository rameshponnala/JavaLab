//Java Program to display list of file names with specified extension using FilenameFilter
import java.io.FilenameFilter;
import java.io.File;

class ExtensionFilter 
{
	public static void main(String[] args) 
	{
		File dir=new File("D:/JavaLab/Annotations");
		
		String javaFiles[]= dir.list(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.toLowerCase().endsWith(".java");
				}
				});

		for(String file: javaFiles)
			System.out.println( file);
	}
}