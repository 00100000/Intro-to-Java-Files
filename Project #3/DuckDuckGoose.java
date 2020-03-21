//
// DuckDuckGoose.java     Author: Aidan Din
//
// Determines the winner of a game with a certain amount
// of players and cycle length
//

import javax.swing.JOptionPane;

public class DuckDuckGoose {
	public static void main (String[]args) {
    boolean[] arr = {true, true, true, true, true, true, true, true};
    System.out.println(playGame(arr, 3));
  }
  public static int playGame(boolean[] array, int cycle) {
  // returns winner, accepts player amount and cycle length
    return 1;
  }
  // recursive solution
  /* static int playGame(final int n, final int k) {
    if (n == 1) {
      return 1;
    } else {
      //excellent recursive solution courtesy of GeeksforGeeks
      return (playGame(n - 1, k) + k-1) % n + 1;
    }
  } */
}