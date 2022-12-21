package Arrays.Easy;

import java.util.Arrays;

public class Easy_3 {
  public static void main(String[] args) {
    /*
     * https://leetcode.com/problems/running-sum-of-1d-array/
     * Given an array nums. We define a running sum of an array as runningSum[i] =
     * sum(nums[0]…nums[i]).
     * 
     * Return the running sum of nums.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,3,4]
     * Output: [1,3,6,10]
     * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
     */
    // int[] arr = { 1, 2, 3, 4 };
    int[] arr = { 1, 1, 1, 1, 1 };
    int[] result = runningSum(arr);
    System.out.println(Arrays.toString(result));
  }

  static int[] runningSum(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int sumOfPrevEl = 0;
      if (i == 0) {
        sumOfPrevEl = nums[i];
      } else {
        sumOfPrevEl = nums[i - 1] + nums[i];
      }
      nums[i] = sumOfPrevEl;
    }
    return nums;
  }
}
