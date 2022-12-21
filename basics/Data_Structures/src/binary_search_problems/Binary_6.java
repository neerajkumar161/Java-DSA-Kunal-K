package binary_search_problems;

public class Binary_6 {
  public static void main(String[] args) {
    /*
     * https://leetcode.com/problems/peak-index-in-a-mountain-array/
     * Another Same Question
     * https://leetcode.com/problems/find-peak-element/
     * 
     * An array arr a mountain if the following properties hold:
     * 
     * arr.length >= 3
     * There exists some i with 0 < i < arr.length - 1 such that:
     * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
     * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
     * Given a mountain array arr, return the index i such that arr[0] < arr[1] <
     * ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
     * 
     * You must solve it in O(log(arr.length)) time complexity.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: arr = [0,1,0]
     * Output: 1
     * Example 2:
     * 
     * Input: arr = [0,2,1,0]
     * Output: 1
     * Example 3:
     * 
     * Input: arr = [0,10,5,2]
     * Output: 1
     */
    int[] arr = { 0, 10, 5, 2 };
    int result = peakIndexInMountainArray(arr);
    System.out.println(result); // 1
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
}
