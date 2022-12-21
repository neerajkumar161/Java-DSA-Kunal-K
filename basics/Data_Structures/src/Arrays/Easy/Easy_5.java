package Arrays.Easy;

import java.util.Arrays;

public class Easy_5 {
  public static void main(String[] args) {
    /*
     * https://leetcode.com/problems/shuffle-the-array/
     * Given the array nums consisting of 2n elements in the form
     * [x1,x2,...,xn,y1,y2,...,yn].
     * 
     * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [2,5,1,3,4,7], n = 3
     * Output: [2,3,5,4,1,7]
     * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is
     * [2,3,5,4,1,7]
     */
    int[] arr = { 1, 2, 3, 4, 4, 3, 2, 1 };
    int n = 4;
    int[] result = shuffle(arr, n);
    System.out.println(Arrays.toString(result));
  }

  static int[] shuffle(int[] nums, int n) {
    int[] resArr = new int[nums.length];
    for (int i = 0; i < n; i++) {
      resArr[i * 2] = nums[i];
      resArr[i * 2 + 1] = nums[n + i];
    }
    return resArr;
  }
}
