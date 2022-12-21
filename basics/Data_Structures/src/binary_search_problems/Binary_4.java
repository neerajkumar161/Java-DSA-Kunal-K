package binary_search_problems;

import java.util.Arrays;

public class Binary_4 {
  public static void main(String[] args) {
    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    int[] arr = { 5, 7, 7, 8, 8, 10 };
    int target = 8;
    int[] result = searchRange(arr, target);
    System.out.println(Arrays.toString(result)); // [3,4]
  }

  static int[] searchRange(int[] nums, int target) {
    int ans[] = { -1, -1 };
    // Find the first occurence of target first
    ans[0] = searchElement(nums, target, true);
    if (ans[0] != -1) {
      ans[1] = searchElement(nums, target, false);
    }
    return ans;
  }

  static int searchElement(int[] nums, int target, boolean isStartIndex) {
    // Inital value of target
    int ans = -1;
    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
      int middle = start + ((end - start) / 2);
      if (target < nums[middle])
        end = middle - 1;
      else if (target > nums[middle])
        start = middle + 1;
      else {
        ans = middle;
        if (isStartIndex)
          end = middle - 1;
        else
          start = middle + 1;
      }
    }
    return ans;
  }
}
