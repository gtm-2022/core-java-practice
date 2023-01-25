 import java.util.Scanner;
 public class Sum_digit {

   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int n, sum=0, rem,sum1=0;
      System.out.println("Enter your Number: ");
      int num=sc.nextInt();
      n=num;
      while(num>0)
      {
        rem=num%10;
        if(rem%2==0)
        {
            sum=sum+rem;
        }
        else if(rem%2==1){
          sum1=sum1+rem;
        }
        
        num=num/10;
     }
    System.out.println("Sum of even digits in "+n+" is "+sum);
    System.out.println("Sum of odd digits in "+n+" is "+sum1);
    sc.close();


    
  }
  
}

    

