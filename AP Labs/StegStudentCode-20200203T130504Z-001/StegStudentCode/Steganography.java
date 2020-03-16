import java.util.*;
import java.awt.Color;

public class Steganography {
   /**
   * Clear the lower (rightmost) two bits in a pixel.
   */
   public static void clearLow(Pixel p)
   {
      // Get the color value of a pixel
      Color oldColor = p.getColor();
      
      // Implement algorithm (/4 then *4)
      // This sets 
      p.setColor(new Color(4*(oldColor.getRed()/4),
                         4*(oldColor.getGreen()/4),
                         4*(oldColor.getBlue()/4)));
      /*   
      int red = p.getRed();
      int green = p.getGreen();
      int blue = p.getBlue();
      
      red /= 4;
      red *= 4;
      p.setRed(red);
      
      green /= 4;
      green *= 4;
      p.setGreen(green);
      
      blue /= 4;
      blue *= 4;
      p.setBlue(blue);*/
      
   }
   
   public static Picture testClearLow(Picture pic) {
      // Create name of object to be returned
      Picture p = new Picture(pic);
      Pixel[][] pixels = p.getPixels2D();
      
      for(int r = 0; r < pixels.length; r++) {
         for (int c = 0; c < pixels[0].length; c++) {
            clearLow(pixels[r][c]);
         }
      
      }
      
      /*Picture pic2 = new Picture(pic);
      
      //Pixel p;
      
      for (int i = 0; i < pic2.getWidth(); i++) {
         for (int j = 0; j < pic2.getHeight(); j++) {
            //clearLow(
            pic2.setColor(i, j, new Color(255, 0, 0, 127).getRGB());
         }
      }
      /*Pixel p = new Pixel(pic, 0, 0);
      clearLow(p);
      
      int red = p.getRed();
      int green = p.getGreen();
      int blue = p.getBlue();*/
      
      
      return p;
   }
   
   /**
   * Set the lower 2 bits in a pixel to the highest 2 bits in c
   */
   public static void setLow(Pixel p, Color c)
   {
      //Pixel p2;
      clearLow(p);
      
      Color c2 = p.getColor();
      
      int r = c.getRed()/64;
      int g = c.getGreen()/64;
      int b = c.getBlue()/64;
      
      p.setColor(new Color(r + c2.getRed(),
                           g + c2.getGreen(),
                           b + c2.getBlue()));
      
                         
      /*p.setColor(new Color(64*(c2.getRed()/64),
                         64*(c2.getGreen()/64),
                         64*(c2.getBlue()/64)));*/ 
   }
   
   public static Picture testSetLow(Picture p, Color c) {
   
      Picture pic = new Picture(p);
      Pixel[][] pixels = pic.getPixels2D();
      
      for(int r = 0; r < pixels.length; r++) {
         for (int col = 0; col < pixels[0].length; col++) {
            setLow(pixels[r][col], c);
         }
      
      }
      
      return pic;
   
   }
   
    /**
   * Sets the highest two bits of each pixel’s colors
   * to the lowest two bits of each pixel’s colors
   * @param hidden picture with hidden image
   * @return revealed picture
   */
  public static Picture revealPicture(Picture hidden)
  {
    Picture copy = new Picture(hidden);
    Pixel[][] pixels = copy.getPixels2D();
    Pixel[][] source = hidden.getPixels2D();
    for (int r = 0; r < pixels.length; r++)
    {
      for (int c = 0; c < pixels[0].length; c++)
      {   
        Color col = source[r][c].getColor();
        Pixel p = pixels[r][c];     
        p.setRed(col.getRed() % 4 * 64);
        p.setGreen(col.getGreen() % 4 * 64);
        p.setBlue(col.getBlue() % 4 * 64);
      }
    }
    return copy;
  }
   
     /**
   * Determines whether secret can be hidden in source, which is
   * true if source and secret are the same dimensions.
   * @param source is not null
   * @param secret is not null
   * @return true if secret can be hidden in source, false otherwise.
   */
  public static boolean canHide(Picture source, Picture secret)
  {
    return source.getWidth() == secret.getWidth() &&
      source.getHeight() == secret.getHeight();
  }
  
     /**
   * Creates a new Picture with data from secret hidden in data from source
   * @param source is not null
   * @param secret is not null
   * @return combined Picture with secret hidden in source
   * precondition: source is same width and height as secret
   */
  public static Picture hidePicture(Picture source, Picture secret)
  {
    Picture hidden = new Picture(source);
    Pixel[][] hPixels = hidden.getPixels2D();
    Pixel[][] sPixels = secret.getPixels2D();
    // Since the images are the same size,
    // either can be used for loop conditions.
    for (int r = 0; r < hPixels.length; r++)
    {
      for (int c = 0; c < hPixels[0].length; c++)
      {
        Pixel s = sPixels[r][c];
        setLow(hPixels[r][c], s.getColor());
      }
    }
    return hidden;
  }
  
  public static void main(String[] args) {
      /*Picture beach = new Picture ("beach.jpg");
      beach.explore();
      Picture copy = testClearLow(beach);
      copy.explore();*/
      
      Picture beach2 = new Picture ("blue-mark.jpg");
      beach2.explore();
      Picture beach3 = new Picture ("blueMotorcycle.jpg");
      beach3.explore();
      
      if(canHide(beach3, beach2)) {
         Picture beach4 = hidePicture(beach3, beach2);
         beach4.explore();
         Picture beach5 = revealPicture(beach4);
         beach5.explore();
      }
      
      else
         System.out.print("Can't hide");
      
   }


}