import java.util.Scanner;

public class if_else_condition {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter  Your Age ");
        int age= scan.nextInt();
        
        if(age>20 && age<80){
            System.out.println("You are Adult");
            

        }
        else if(age>5 && age<20){
            System.out.println("You are not kid");

        }
        else if(age>=80){
            System.out.println("you are old");
        }
        else{
            System.out.println("you are kid");
        }
        scan.close();
    }

    
}
