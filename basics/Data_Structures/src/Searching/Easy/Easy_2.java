package Searching.Easy;

public class Easy_2 {
  public static void main(String[] args) {
    /*
     * https://leetcode.com/problems/guess-number-higher-or-lower/
     * We are playing the Guess Game. The game is as follows:
     * 
     * I pick a number from 1 to n. You have to guess which number I picked.
     * 
     * Every time you guess wrong, I will tell you whether the number I picked is
     * higher or lower than your guess.
     * 
     * You call a pre-defined API int guess(int num), which returns three possible
     * results:
     * 
     * -1: Your guess is higher than the number I picked (i.e. num > pick).
     * 1: Your guess is lower than the number I picked (i.e. num < pick).
     * 0: your guess is equal to the number I picked (i.e. num == pick).
     * Return the number that I picked.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: n = 10, pick = 6
     * Output: 6
     * Example 2:
     * 
     * Input: n = 1, pick = 1
     * Output: 1
     * Example 3:
     * 
     * Input: n = 2, pick = 1
     * Output: 1
     */
  }

  static int guess(int num) {
    return 0;
  }

  static int guessNumber(int n) {
    int low = 0;
    int high = n;
    while (low <= high) {
      int mid = low + (high - low) / 2; // same as low + high / 2
                                        // https://leetcode.com/problems/guess-number-higher-or-lower/discuss/84668/Short-Java-code-using-binary-search
      if (guess(mid) == 0) // Picked Number
        return mid;
      else if (guess(mid) == 1) // Guess > 6 , RHS
        low = mid + 1;
      else
        high = mid - 1; // Guess > 6, LHS
    }
    return low;
  }
}
