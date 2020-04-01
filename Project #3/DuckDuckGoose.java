//
// DuckDuckGoose.java     Author: Aidan Din
//
// Determines the winner of a game with a certain amount
// of players and cycle length
//

import javax.swing.JOptionPane;

public class DuckDuckGoose {
  public static void main(String[] args) {
    // user interactions
    int players = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of players in your game"));
    int cycleLength = Integer.parseInt(JOptionPane.showInputDialog("Please enter the length of a cycle in your game"));
    boolean[] playerArr = new boolean[players];
    // array constructor
    for (int i = 0; i < players; i++) {
      playerArr[i] = true;
    }
    
    // output
    JOptionPane.showMessageDialog(null, "The winner of your game is player " + playGame(playerArr, cycleLength));
  }

  public static int playGame(boolean[] array, int cycle) {
    // returns winner, accepts player amount and cycle length
    int position = 0;
    int ret = 0;
    // increments position by cycle, loop stop condition when cycles < array length
    for (int i = 0; i < array.length; position += cycle) {
      // keeps positon under array length
      if (position > array.length - 1) {
        position -= array.length;
      }
      if (array[position] == true) {
        array[position] = false;
      }
      // skips over already eliminated players
      while (array[position] == false) {
        position++;
        // keeps position under array length
        if (position > array.length - 1) {
          position -= array.length;
        }
      }
      // cycle count increment
      i++;
    }
    // locates position of the surviving player
    for (int x = 0; x < array.length - 1; x++) {
      if (array[x] == true) {
        ret = x;
      }
    }
    return ret;
  }
}