package binary_search_problems;

public class Binary_7 {
  public static void main(String[] args) {
    /*
     * https://leetcode.com/problems/find-in-mountain-array/
     * You may recall that an array arr is a mountain array if and only if:
     * 
     * arr.length >= 3
     * There exists some i with 0 < i < arr.length - 1 such that:
     * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
     * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
     * Given a mountain array mountainArr, return the minimum index such that
     * mountainArr.get(index) == target. If such an index does not exist, return -1.
     * 
     * You cannot access the mountain array directly. You may only access the array
     * using a MountainArray interface:
     * 
     * MountainArray.get(k) returns the element of the array at index k (0-indexed).
     * MountainArray.length() returns the length of the array.
     * Submissions making more than 100 calls to MountainArray.get will be judged
     * Wrong Answer. Also, any solutions that attempt to circumvent the judge will
     * result in disqualification.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: array = [1,2,3,4,5,3,1], target = 3
     * Output: 2
     * Explanation: 3 exists in the array, at index=2 and index=5. Return the
     * minimum index, which is 2.
     * Example 2:
     * 
     * Input: array = [0,1,2,4,2,1], target = 3
     * Output: -1
     * Explanation: 3 does not exist in the array, so we return -1.
     */
    int[] arr = { 0, 1, 2, 4, 2, 1 };
    int target = 3;
    int result = search(arr, target);
    System.out.println(result); // -1
  }

  static int search(int[] arr, int target) {
    int peakElementIndex = peakIndexInMountainArray(arr);
    int firstHalf = orderAgnosticAlgorithm(arr, target, 0, peakElementIndex);

    if (firstHalf != -1)
      return firstHalf;
    return orderAgnosticAlgorithm(arr, target, peakElementIndex, arr.length - 1);

  }

  static int peakIndexInMountainArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      int middle = start + ((end - start) / 2);
      if (arr[middle] > arr[middle + 1]) // means we are in decreasing order
        end = middle;
      else // we are in ASC order
        start = middle + 1;

      // loop will break when start == end , i.e our peak element, and we will return
      // either start or end
    }
    return start; // || end
  }

  static int orderAgnosticAlgorithm(int[] arr, int target, int start, int end) {
    // Check the Order of the Array
    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
      // int middle = (start + end) / 2; // Might happen middle value exceeds int
      // range, instead we refactor this to
      int middle = start + ((end - start) / 2);
      if (target == arr[middle])
        return middle;

      if (target < arr[middle]) {
        if (isAsc)
          end = middle - 1;
        else
          start = middle + 1;
      }
      if (target > arr[middle]) {
        if (isAsc)
          start = middle + 1;
        else
          end = middle - 1;
      }

    }
    return -1;
  }
}
