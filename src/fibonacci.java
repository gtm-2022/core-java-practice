import java.util.Scanner;

public class fibonacci {
    static int fib(int n){
        if(n<=1)
        return n;
        return fib(n-1) + fib(n-2);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the fibonacci number");
        int n=sc.nextInt();
        System.out.println("the"+n+"th fibonacci number is "+(fib(n)));
        sc.close();
    }
}
