public class TestFor{
  public static void main(String args[]){
    int i=0;
    for(;;){
    if(i<10){
      System.out.println("i: "+i++);
      continue;
    }
    else
       break;

    }

  }

}
