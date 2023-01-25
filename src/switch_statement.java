import java.util.Scanner;

public class switch_statement {

public static void main(String[] args) {
    Scanner scan=  new Scanner(System.in);
        System.out.println("Enter  Your Age ");
        int age= scan.nextInt();
    
        
    switch(age){
        case 12:
        System.out.println("You are 12 years old");
        break;
        case 34:
        System.out.println("You are 34 years old");
        break;
        case 54:
        System.out.println("you are 54 years old");
        break;
        default:
        System.out.println("You did not match any  of the cases");
        scan.close();


    }
}
}

