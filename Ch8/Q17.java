import java.util.Scanner; 

public class Q17 {
   private static String validFileName(String fileName) {
      int pEnd = fileName.lastIndexOf("."); 
      
      if(pEnd == -1) {
         if(fileName.indexOf(':') > -1 || fileName.indexOf('?') > -1 || fileName.indexOf('*') > -1)
            return null;
         return fileName.toUpperCase() + ".TXT";
      }
       
      String inv = fileName.substring(0, pEnd);
      
      if (inv.length() > 8)
         return null;
      else if(inv.indexOf('.') > -1 || fileName.indexOf(':') > -1 || fileName.indexOf('?') > -1 || fileName.indexOf('*') > -1)
         return null;
      switch((fileName.length()-1) - pEnd) {
         case 0:
            fileName = fileName.replace(".", "");
            return fileName;
         case 1:
         case 2: 
         case 3:
            return fileName;
         default:
            return null;
      }  
         
   }

   public static void main(String args[]) {
   
      Scanner sc = new Scanner(System.in);
 	   System.out.print("File: "); 
 	   String s1 = sc.nextLine();
      sc.close();
      
      System.out.print(validFileName(s1));
   }
}