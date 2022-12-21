package binary_search_problems;

public class Binary_5 {
  public static void main(String[] args) {
    /*
     * Find the position of the element in infinite array i.e we cannot use
     * arr.length method
     * Solution: Serach in chunks, and every time ouble the chunk size of previous
     * chunk size, Reverse of Binary Search method, means not from N to 1, but 1 to
     * logN
     */
    int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
    int target = 10;
    System.out.println(searchInInfiniteArray(arr, target)); // 4
  }

  static int searchInInfiniteArray(int[] arr, int target) {
    int start = 0;
    int end = 1;

    while (target > arr[end]) {
      int newStart = end + 1;
      /* double the box value, end = previousEnd + sizeOfBox * 2 */
      end = end + (end - start + 1) * 2;
      start = newStart;
    }

    return binarySearch(arr, target, start, end);
  }

  static int binarySearch(int[] arr, int target, int start, int end) {
    while (start <= end) {
      int middle = start + ((end - start) / 2);
      if (target < arr[middle])
        end = middle - 1;
      else if (target > arr[middle])
        start = middle + 1;
      else
        return middle;
    }
    return -1;
  }
}
