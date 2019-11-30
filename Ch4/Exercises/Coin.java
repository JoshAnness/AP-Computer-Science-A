// Chapter 4 Question 9

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Coin {
   private int f = 0;
   private Image heads;
   private Image tails;
   private int xUL;
   private int yUL;

   public Coin(Image h, Image t){
      heads = h;
      tails = t;
      
   }
   
   public void flip() {
      //f = getRandom(1);
      if (f == 0)
         f = 1;
      else
         f = 0; 
        
   }
   
   public void draw(Graphics g, int x, int y) {
      xUL = x-110;
      yUL = y-110;
      if(f == 0)
         g.drawImage(heads, xUL, yUL, null);
      else
         g.drawImage(tails, xUL, yUL, null);
   
   }
   
   /*public static int getRandom(int max) {
        return (int)(Math.random()*max);
    }*/
   
}