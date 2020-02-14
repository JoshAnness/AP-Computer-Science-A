import java.util.*;

public class Q13 {
   public static void words(List<String> words) {
      ArrayList<String> listA = new ArrayList<String>();
      ArrayList<String> listB = new ArrayList<String>();
      ArrayList<String> listC = new ArrayList<String>();
      ArrayList<String> listD = new ArrayList<String>();
      ArrayList<String> listE = new ArrayList<String>();
      ArrayList<String> listF = new ArrayList<String>();
      ArrayList<String> listG = new ArrayList<String>();
      ArrayList<String> listH = new ArrayList<String>();
      ArrayList<String> listI = new ArrayList<String>();
      ArrayList<String> listJ = new ArrayList<String>();
      ArrayList<String> listK = new ArrayList<String>();
      ArrayList<String> listL = new ArrayList<String>();
      ArrayList<String> listM = new ArrayList<String>();
      ArrayList<String> listN = new ArrayList<String>();
      ArrayList<String> listO = new ArrayList<String>();
      ArrayList<String> listP = new ArrayList<String>();
      ArrayList<String> listQ = new ArrayList<String>();
      ArrayList<String> listR = new ArrayList<String>();
      ArrayList<String> listS = new ArrayList<String>();
      ArrayList<String> listT = new ArrayList<String>();
      ArrayList<String> listU = new ArrayList<String>();
      ArrayList<String> listV = new ArrayList<String>();
      ArrayList<String> listW = new ArrayList<String>();
      ArrayList<String> listX = new ArrayList<String>();
      ArrayList<String> listY = new ArrayList<String>();
      ArrayList<String> listZ = new ArrayList<String>();
      
      for(int i = 0; i < words.size(); i++) {
         if(words.get(i).equals(""))
            break;
         switch(words.get(i).charAt(0)) {
            case 'a':
               listA.add(words.get(i));
               break;
            case 'b':
               listB.add(words.get(i));
               break;
            case 'c':
               listC.add(words.get(i));
               break;
            case 'd':
               listD.add(words.get(i));
               break;
            case 'e':
               listE.add(words.get(i));
               break;
            case 'f':
               listF.add(words.get(i));
               break;
            case 'g': 
               listG.add(words.get(i));
               break;
            case 'h':
               listH.add(words.get(i));
               break;
            case 'i':
               listI.add(words.get(i));
               break;
            case 'j':
               listJ.add(words.get(i));
               break;
            case 'k':
               listK.add(words.get(i));
               break;
            case 'l':
               listL.add(words.get(i));
               break;
            case 'm':
               listM.add(words.get(i));
               break;
            case 'n':
               listN.add(words.get(i));
               break;
            case 'o':
               listO.add(words.get(i));
               break;
            case 'p':
               listP.add(words.get(i));
               break;
            case 'q':
               listQ.add(words.get(i));
               break;
            case 'r':
               listR.add(words.get(i));
               break;
            case 's':
               listS.add(words.get(i));
               break;
            case 't':
               listT.add(words.get(i));
               break;
            case 'u':
               listU.add(words.get(i));
               break;
            case 'v':
               listV.add(words.get(i));
               break;
            case 'w':
               listW.add(words.get(i));
               break;
            case 'x':
               listX.add(words.get(i));
               break;
            case 'y':
               listY.add(words.get(i));
               break;
            case 'z':
               listZ.add(words.get(i));
               break;
            default:
               break;
         }
     }
      System.out.println("A: " + listA);
      System.out.println("B: " + listB);
      System.out.println("C: " + listC);
      System.out.println("D: " + listD);
      System.out.println("E: " + listE);
      System.out.println("F: " + listF);
      System.out.println("G: " + listG);
      System.out.println("H: " + listH);
      System.out.println("I: " + listI);
      System.out.println("J: " + listJ);
      System.out.println("K: " + listK);
      System.out.println("L: " + listL);
      System.out.println("M: " + listM);
      System.out.println("N: " + listN);
      System.out.println("O: " + listO);
      System.out.println("P: " + listP);
      System.out.println("Q: " + listQ);
      System.out.println("R: " + listR);
      System.out.println("S: " + listS);
      System.out.println("T: " + listT);
      System.out.println("U: " + listU);
      System.out.println("V: " + listV);
      System.out.println("W: " + listW);
      System.out.println("X: " + listX);
      System.out.println("Y: " + listY);
      System.out.println("Z: " + listZ);
   }
   
   public static void main(String[] args) {      
      List<String> list = Arrays.asList("af", "bd", "a", "b", "g", "k", "ab");
      
      list.replaceAll(String::toLowerCase);
      
      words(list);
      
       
   }
}