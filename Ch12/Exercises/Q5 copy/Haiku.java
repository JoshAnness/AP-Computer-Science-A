import java.util.*;

public class Haiku extends Poem {
  private int lines = 3;

  public int getSyllables(int k) {
    switch (k) {
      case 0:
      case 2:
        return 5;
      case 1:
        return 7;
      default:
        return 0;
    }

  }

  public int numLines() {
    return lines;
  }


}