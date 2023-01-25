
public class array_concept {
    public static void main(String[] args) {
        int[] marks= {1,2,3,4,5};
        marks[4]=87; // this will update marks[4]
        System.out.println(marks[0]);
        System.out.println(marks[4]);
        //classiacal way to iterate an array 
        for (int i=0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("This is for each loop");
        // for each loop
        for(int value:marks){
            System.out.println(value);
            
        }
        

    }
}
