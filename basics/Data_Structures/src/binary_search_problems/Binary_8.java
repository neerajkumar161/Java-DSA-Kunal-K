package binary_search_problems;

public class Binary_8 {
  public static void main(String[] args) {
    /*
     * https://leetcode.com/problems/search-in-rotated-sorted-array/
     * There is an integer array nums sorted in ascending order (with distinct
     * values).
     * 
     * Prior to being passed to your function, nums is possibly rotated at an
     * unknown pivot index k (1 <= k < nums.length) such that the resulting array is
     * [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
     * (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3
     * and become [4,5,6,7,0,1,2].
     * 
     * Given the array nums after the possible rotation and an integer target,
     * return the index of target if it is in nums, or -1 if it is not in nums.
     * 
     * You must write an algorithm with O(log n) runtime complexity.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [4,5,6,7,0,1,2], target = 0
     * Output: 4
     * Example 2:
     * 
     * Input: nums = [4,5,6,7,0,1,2], target = 3
     * Output: -1
     */
    // int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
    int[] arr = { 3, 5, 1 };
    // int[] arr = { 3, 3, 5, 5, 1, 1 };
    int target = 3;
    int result = search(arr, target);
    System.out.println(result); // 4

  }

  static int search(int[] arr, int target) {
    int pivot = findPivot(arr);
    // if pivot is -1, which means array is not rotated
    if (pivot == -1) {
      return binarySearch(arr, target, 0, arr.length - 1);
    }
    // if pivot is found, we've found two ascending sorted arrays
    if (arr[pivot] == target)
      return pivot;

    // if target >= start, means we have to find in first sorted array
    if (target >= arr[0])
      return binarySearch(arr, target, 0, pivot - 1);

    // if target <= start, means we have to find in second sorted array
    else
      return binarySearch(arr, target, pivot + 1, arr.length - 1);
  }

  static int binarySearch(int[] arr, int target, int start, int end) {
    while (start <= end) {
      int middle = start + ((end - start) / 2);
      if (arr[middle] == target)
        return middle;
      if (arr[middle] > target)
        end = middle - 1;
      if (arr[middle] < target)
        start = middle + 1;
    }
    return -1;
  }

  static int findPivot(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int middle = start + ((end - start) / 2);

      // 1st Case
      if (middle < end && arr[middle] > arr[middle + 1])
        return middle;
      // 2nd Case
      if (middle > start && arr[middle] < arr[middle - 1])
        return middle - 1;
      // 3rd Case
      if (arr[middle] <= arr[start])
        end = middle - 1;
      // 4th Case
      else
        start = middle + 1;
    }

    return -1;
  }

  /* Not Working, solve this later on -- Binary_9.java */
  static int findPivotWithDuplicates(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int middle = start + ((end - start) / 2);

      // 1st Case
      if (middle < end && arr[middle] > arr[middle + 1])
        return middle;
      // 2nd Case
      if (middle > start && arr[middle] < arr[middle - 1])
        return middle - 1;
      // if elements at start, end and middle are same, skip duplicates
      if (arr[middle] == arr[start] && arr[middle] == arr[end]) {
        // NOTE: what if the these elements at start and end were pivots
        // check if start is pivot
        if (arr[start] > arr[start + 1])
          return arr[start];
        start++;
        if (arr[end] < arr[end - 1])
          return arr[end];
        end--;
      } else if (arr[start] > arr[middle] && (arr[start] == arr[middle] && arr[middle] > arr[end])) {
        start = middle + 1;
      } else {
        end = middle + 1;
      }
      // left side is sorted, so pivot should be in right
    }

    return -1;
  }
}
