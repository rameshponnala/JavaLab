import java.util.Scanner;
public class TwoDimArray{
    public static void main(String [] args){
         int [ ][ ] twodim_array =new  int[ 2][2];
         Scanner sc=new Scanner(System.in);
         //Read Elements
         for(int i=0;i<2;i++){
	for(int j=0;j<2;j++){
                         System.out.println("Enter "+ i+ " "+ j+ "element");
                         twodim_array [i][j]=sc.nextInt();
                   }
         }
        //Display 2-d Array Elements
         System.out.println(" Two Dimensional Array elements are...");
         for(int i=0;i<2;i++){
	for(int j=0;j<2;j++){
                         System.out.print("\t"+ twodim_array [i][j]);
                   }
	System.out.println("\n\n");
         }

   }
}

    
         
         