import java.util.*;

public class Limerick extends Poem {
  private int lines = 5;

  public int getSyllables(int k) {
    switch (k) {
      case 0:
      case 1:
      case 4:
        return 9;
      case 2:
      case 3:
        return 6;
      default:
        return 0;
    }

  }

  public int numLines() {
    return lines;
  }


}