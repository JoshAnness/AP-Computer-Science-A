//Chapter 4 Question 7
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Book {
   private int numPages;
   private int currentPage;
   
   public void pager(int i) {
    numPages = i;
    currentPage = 1;
  }
  
  public int getNumPages() {
   return numPages;
  }
  
  public int getCurrentPage() {
   return currentPage;
  }
  
  public void nextPage() {
   if (currentPage < numPages)
      currentPage++;
  }
  
}

 