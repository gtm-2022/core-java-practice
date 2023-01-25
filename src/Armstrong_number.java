import java.util.Scanner;
public class Armstrong_number {

    public static void main(String[] args) {
        int n,a,r,sum=0;
        System.out.println("Enter  a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();


        a = n;

        while (a != 0)
        {
            r = a % 10;
            sum= sum+ (r*r*r);
            a= a/10;
        }

        if(sum ==n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
            sc.close();
    }
}
