public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = { 1, 34, 56, 67, 89, 345, 786, 5000 };
    int binarySearchResult = algorithm(arr, 786);
    System.out.println(binarySearchResult);

    int[] descArray = { 99, 67, 45, 34, 22, 3, -12, -49, -299 };
    int orderAgnosticResult = orderAgnosticAlgorithm(descArray, -299);
    System.out.println(orderAgnosticResult);
  }

  /*
   * How much efficient is BinarySearch over LinearSearch
   * https://youtu.be/f6UU7V3szVw?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=1753
   */

  static int algorithm(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      // int middle = (start + end) / 2; // Might happen middle value exceeds int
      // range, instead we refactor this to
      int middle = start + ((end - start) / 2);
      if (target < arr[middle]) {
        end = middle - 1;
      }
      if (target > arr[middle]) {
        start = middle + 1;
      }
      if (target == arr[middle])
        return middle;

    }
    return -1;
  }

  /*
   * Order Agnostic Binary Search (When we don't know whether array is in ASC or
   * DESC order)
   */
  static int orderAgnosticAlgorithm(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
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
