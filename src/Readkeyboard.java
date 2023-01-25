import java.util.*;
public class Readkeyboard {
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      sc.useRadix(2);
      System.out.println("Enter the binary number: ");
      int x=sc.nextInt();
      System.out.println("The value in decimal is: "+x);
    sc.close();
  }  
}
