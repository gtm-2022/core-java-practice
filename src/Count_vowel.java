/* Write a program to print the number of  distinct vowels present in a word  */
import java.util.Scanner;

public class Count_vowel {
   public static void main(String[] args) {
    int count=0;

    Scanner str=new Scanner(System.in);
    System.out.println("Enter a  any Word or sentence");
    String w=str.nextLine();
    w=w.toLowerCase();
    
for(int i=0;i<w.length(); i++){
    if(w.charAt(i)=='a' 
    || w.charAt(i)=='e' 
    || w.charAt(i)=='i' 
    || w.charAt(i)=='u'){
        count++;
    }
}
System.out.println("Total no. of vowels in "+w+" are: "+count);
str.close();
   } 
}
