// The DuckDuckGoose project is similar to the Joisephus problem, but way
// more trivial. This is a mathematical solution with n being the amount of
// players and k being the cycle amount

class MathDDG {
  public static void main (String[]args) {
    System.out.println(playGame(9, 4));
  }
  static int playGame(final int n, final int k) {
    if (n == 1) {
      return 1;
    } else {
      //excellent recursive solution courtesy of GeeksforGeeks
      return (playGame(n - 1, k) + k-1) % n + 1;
    }
  }
}