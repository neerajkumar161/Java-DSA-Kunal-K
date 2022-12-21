package Arrays.Easy;

import java.util.Arrays;

public class Easy_1 {
  public static void main(String[] args) {

    /*
     * https://leetcode.com/problems/build-array-from-permutation/
     * 
     * Problem
     * Input: nums = [0,2,1,5,3,4]
     * Output: [0,1,2,4,5,3]
     * Explanation: The array ans is built as follows:
     * ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]],
     * nums[nums[4]], nums[nums[5]]]
     * = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
     * = [0,1,2,4,5,3]
     */

    int[] input = { 0, 2, 1, 5, 3, 4 };
    int[] result = buildArray(input);
    System.out.println(Arrays.toString(result));
  }

  static int[] buildArray(int[] nums) {
    int[] resultArray = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      resultArray[i] = nums[nums[i]];
    }

    return resultArray;
  }
}
