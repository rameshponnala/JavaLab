import java.util.Scanner;
public class JaggedArray{
    public static void main(String [] args){
         int [ ][ ] twodim_array =new  int[ 3][];
         Scanner sc=new Scanner(System.in);
        //Declaring Column sizes of Jagged Array
        twodim_array[0]=new int[3];
         twodim_array[1]=new int[5];
         twodim_array[2]=new int[2];

         //Read Elements
         for(int i=0;i<3;i++){
	for(int j=0;j<twodim_array[i].length;j++){
                         System.out.println("Enter "+ i+ " "+ j+ "element");
                         twodim_array [i][j]=sc.nextInt();
                   }
         }
        //Display Jagged Array Elements
         System.out.println(" Two Dimensional Jagged Array elements are...");
         for(int i=0;i<3;i++){
	for(int j=0;j<twodim_array[i].length;j++){
                         System.out.print("\t"+ twodim_array [i][j]);
                   }
	System.out.println("\n\n");
         }
   }}

    
         
         