package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class Easy_6 {
  public static void main(String[] args) {

    /*
     * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
     * There are n kids with candies. You are given an integer array candies, where
     * each candies[i] represents the number of candies the ith kid has, and an
     * integer extraCandies, denoting the number of extra candies that you have.
     * 
     * Return a boolean array result of length n, where result[i] is true if, after
     * giving the ith kid all the extraCandies, they will have the greatest number
     * of candies among all the kids, or false otherwise.
     * 
     * Note that multiple kids can have the greatest number of candies.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: candies = [2,3,5,1,3], extraCandies = 3
     * Output: [true,true,true,false,true]
     * Explanation: If you give all extraCandies to:
     * - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the
     * kids.
     * - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the
     * kids.
     * - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the
     * kids.
     * - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among
     * the kids.
     * - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the
     * kids.
     */

    int[] arr = { 2, 3, 5, 1, 3 };
    int extraCandies = 3;
    List<Boolean> result = kidsWithCandies(arr, extraCandies);
    System.out.println(result);
  }

  static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int largest = 0;
    List<Boolean> result = new ArrayList<Boolean>(candies.length);
    // Finding out largest candy in array
    for (int i = 0; i < candies.length; i++) {
      if (largest <= candies[i])
        largest = candies[i];
    }

    for (int i = 0; i < candies.length; i++) {
      int value = candies[i] + extraCandies;
      System.out.println(value + " " + largest);
      if (value >= largest) {
        result.add(i, true);
      } else {
        result.add(i, false);
      }
    }

    return result;

  }
}