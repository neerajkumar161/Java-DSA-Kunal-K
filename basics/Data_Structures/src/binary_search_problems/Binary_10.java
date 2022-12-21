package binary_search_problems;

public class Binary_10 {
  public static void main(String[] args) {
    // find the Rotation count in sorted rotated array
    int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2 };
    int result = rotationCount(arr);
    System.out.println(result); // 4

  }

  static int rotationCount(int[] arr) {
    return findPivot(arr) + 1;
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
}
