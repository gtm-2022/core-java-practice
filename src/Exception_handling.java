public class Exception_handling {
    public static void main(String[] args) {
        String [] cars = {"maruti","suzuki","innova","ford titenium"};
        try{

        
        System.out.println(cars[9]);
        }
        catch(Exception e ) {
            System.out.println((e));
        }
    
    finally{
    System.out.println("finally block is always execuited");
        }
System.out.println("rest of the code..... ");
        
}
}
