// The DuckDuckGoose project is similar to the Joisephus problem, but way
// more trivial. This is a mathematical solution with n being the amount of
// players and k being the cycle amount
import javax.swing.JOptionPane;

public class MathDDG {
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
    return josephus(array.length, cycle) - 1;
  }

  static int josephus(int n, final int k) {
    if (n == 1) {
      return 1;
    } else {
      // recursive solution
      return (josephus(n - 1, k) + k - 1) % n + 1;
    }
  }
}