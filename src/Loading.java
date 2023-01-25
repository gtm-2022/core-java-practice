class Overloading{
    float length , breadth;
    Overloading(float x, float y){
        length=x;
        breadth=y;
    }
    Overloading(float c){
        breadth=c;
        length=breadth;
    }
    float area(){
        System.out.println("area is "+ length*breadth);
        return length*breadth;
    }
    
}
public class Loading {
   public static void main(String[] args) {
       Overloading obj = new Overloading(10, 20);
       Overloading obj1 = new Overloading(10);
       obj.area();
       obj1.area();
       System.out.println(obj.area());
   }
}
