
import java.util.*;
public class Reading_from_keyboard {
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String name;
       System.out.println("May I know your Name:");
       name=s.nextLine();
       System.out.println("Welcome Mr./Mrs " +name);
       s.close();
   } 
}
