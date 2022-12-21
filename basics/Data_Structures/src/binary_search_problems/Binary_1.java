package binary_search_problems;

public class Binary_1 {
  public static void main(String[] args) {
    // Find Ceiling of a number is an array, smallest of greater numbers or equal
    // to.
    // [1,3,5,6,8,14], target = 13 Answer = 14
    int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
    int target = 6;
    int result = celing(arr, target);
    System.out.println(result);
  }

  static int celing(int[] arr, int target) {
    if (target > arr[arr.length - 1])
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

    return arr[start];
  }
}
