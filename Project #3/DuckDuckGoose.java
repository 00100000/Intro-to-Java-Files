//
// DuckDuckGoose.java     Author: Aidan Din
//
// Determines the winner of a game with a certain amount
// of players and cycle length
//

import javax.swing.JOptionPane;

public class DuckDuckGoose {
  public static void main(String[] args) {
    do {
      // user interactions
      int players = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of players in your game"));
      int cycleLength = Integer
          .parseInt(JOptionPane.showInputDialog("Please enter the length of a cycle in your game"));
      boolean[] playerArr = new boolean[players];
      // array constructor
      for (int i = 0; i < players; i++) {
        playerArr[i] = true;
      }

      // output
      JOptionPane.showMessageDialog(null, "The winner of your game is player " + playGame(playerArr, cycleLength));
    } while (JOptionPane.showConfirmDialog(null, "Would you like to re-run the program?", null,
        JOptionPane.YES_NO_OPTION) == 0);
  }

  public static int playGame(boolean[] array, int cycle) {
    // returns winner, accepts player amount and cycle length
    int ret = 0;
    int len = array.length;
    int pointer = 0;

    // iterates this loop enough times to remove all but 1 player
    for (int x = 0; x < len - 1; x++) {
      // skips over falses every cycle by ignoring them for i, but not for pointer
      for (int i = cycle; i != 0; pointer++) {
        pointer %= (len - 1);
        if (array[pointer] == true) i--; pointer++;
        if (array[pointer] == false) pointer++;
      }
      pointer %= (len - 1);
      array[pointer] = false;
    }
    // scans array for winner
    for (int x = 0; x < len - 1; x++) {
      if (array[x] == true) {
        ret = x;
      }
    }
    return ret;
  }
}