import java.util.Scanner;

public class Check_Armstrong {
    public static void main(String[] args) {
        int a, b, c, n, nn, sum;
        System.out.println("Enter three digit number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // 153
        nn = n;
        a = n % 10;// 3
        n = n / 10;
        b = n % 10;// b=5
        c = n / 10;// c=1
        a = a * a * a;
        b = b * b * b;
        c = c * c * c;
        sum = a + b + c;
        if (nn == sum) {
            System.out.println("The number is armstron");
        } else if (n < 100 || n > 9) {
            System.out.println("You have entered two digit number");
        } else if (n < 9 || n > 0) {
            System.out.println("you have entered one digit number");
        } else if (n == 0) {
            System.out.println("You have entered zero ");
        } 
        else if(n<0){
            System.out.println("Armstron is not applicable for negative number");
        }
        else  {
            System.out.println("The number is not an armstrong");
        }
        
        sc.close();

    }

}
