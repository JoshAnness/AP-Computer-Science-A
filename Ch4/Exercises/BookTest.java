//Chapter 4 Question 7
public class BookTest extends Book {
   public static void main(String[] args) {
    Book myBook = new Book();
    myBook.pager(3);
    for(int i = 0; i < 3; i++) {
      System.out.println("Value of current page is: " + myBook.getCurrentPage());
      myBook.nextPage();
      
    }
 }
 
}