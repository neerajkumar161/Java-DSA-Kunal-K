package Arrays.Easy;

import java.util.Arrays;

public class Easy_2 {
  public static void main(String[] args) {
    /*
     * https://leetcode.com/problems/concatenation-of-array/
     * 
     * Given an integer array nums of length n, you want to create an array ans of
     * length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n
     * (0-indexed).
     * 
     * Specifically, ans is the concatenation of two nums arrays. Return the array
     * ans.
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,1]
     * Output: [1,2,1,1,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
     * - ans = [1,2,1,1,2,1]
     */

    int[] arr = { 1, 2, 1 };
    int[] result = getConcatenation(arr);
    System.out.println(Arrays.toString(result));
  }

  static int[] getConcatenation(int[] nums) {
    int[] resultArr = new int[nums.length * 2];
    for (int i = 0; i < nums.length; i++) {
      resultArr[i] = resultArr[i + nums.length] = nums[i];
    }
    return resultArr;
  }
}