package binary_search_problems;

public class Binary_2 {
  public static void main(String[] args) {
    // Find Floor of a number is an array, greatest of smallest numbers or equal
    // to.
    // [1,3,5,6,8,14], target = 13 Answer = 9
    int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
    int target = 20;
    int result = floor(arr, target);
    System.out.println(result);
  }

  static int floor(int[] arr, int target) {
    if (target < arr[0])
      return -1;

    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int middle = start + ((end - start) / 2);

      if (target < arr[middle]) {
        end = middle - 1;
      }
      if (target > arr[middle]) {
        start = middle + 1;
      }
      if (target == arr[middle]) {
        return middle;
      }
    }

    return arr[end];
  }
}
