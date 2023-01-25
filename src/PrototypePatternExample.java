import java.util.ArrayList;
import java.util.List;
class Book implements Cloneable {
 private List<String> bookList;

 public Book() {
 this.bookList = new ArrayList<String>();
 }

 public Book(List<String> list) {
 this.bookList = list;
 }

 public void insertData() {
 bookList.add("Think and Grow Rich ");
 bookList.add("Rich Dad Poor Dad");
 bookList.add("Ikigai");
 bookList.add("Bhagavad Geeta");
 bookList.add("The five love language");
 bookList.add("Intelligent Investor");
 }
 public List<String> getBookList() {
    return this.bookList;
    }
   
    @Override
    public Object clone() throws CloneNotSupportedException {
    List<String> tempList = new ArrayList<String>();
   
    for(String s : this.getBookList()) {
    tempList.add(s);
    }
   
    return new Book(tempList);
    }
   }
   public class PrototypePatternExample {
    public static void main(String[] args)
    throws CloneNotSupportedException {
    Book a = new Book();
    a.insertData();
   
    Book b = (Book) a.clone();
    List<String> list = b.getBookList();
    list.add("It that frog");

    System.out.println(a.getBookList());
    System.out.println(list);
   
    b.getBookList().remove("Ikigai");
    System.out.println(list);
    System.out.println(a.getBookList());
    }
   }
