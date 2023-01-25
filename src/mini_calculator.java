import java.util.Scanner;

public class mini_calculator {
    public static void main(String[] args) {
        float number_1, number_2;
        System.out.println("Enter the first number");
        Scanner sc= new Scanner(System.in);
        number_1=sc.nextFloat();
        System.out.println("Enter the second number");
        number_2=sc.nextFloat();
        System.out.println(number_1);
        System.out.println(number_2);
        String prompt = "Enter 0 for addition,1 for " + 
        "subtraction, 2 for multiplication and 3 for division";
        System.out.println(prompt);
        int input =sc.nextInt();
        switch(input){
            case 0:
            System.out.println("Addint this numbers ");
            System.out.println("The result is ");
            System.out.println(number_1+number_2);
            break;
            case 1:
            System.out.println("subtract  these numbers ");
            System.out.println("The result is ");
            System.out.println(number_1-number_2 );
            break;
            case 2:
            System.out.println("Multiplying these numbers ");
            System.out.println("The result is ");
            System.out.println(number_1*number_2 );
            break;
            case 3:
            System.out.println("dividing these numbers ");
            System.out.println("The result is ");
            System.out.println(number_1/number_2 );
            break;
            default:
            
            System.out.println("Invalid input");
            sc.close();
            
        }

    }
    
}
