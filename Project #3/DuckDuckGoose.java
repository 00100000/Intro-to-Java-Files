//
// DuckDuckGoose.java     Author: Aidan Din
//
// Determines the winner of a game with a certain amount
// of players and cycle length
//

import javax.swing.JOptionPane;

public class DuckDuckGoose {
  public static void main(String[] args) {
    boolean[] arr = { true, true, true, true, true, }; // 3
    System.out.println(playGame(arr, 3));
  }

  public static int playGame(boolean[] array, int cycle) {
    // returns winner, accepts player amount and cycle length
    int cycleAmount = 0;
    int ret = 0;

    for (int i = 0; cycleAmount < array.length; i += cycle) {
      // forgive me lord for these nested loops
      while (array[i] == false) {
        i++;
        i %= array.length;
      }
      if (array[i] == true) {
        array[i] = false;
      }
    }

    for (int x = 0; x < array.length; x++) {
      if (array[x] == true) {
        ret = x;
      }
    }
    return ret;
  }
}