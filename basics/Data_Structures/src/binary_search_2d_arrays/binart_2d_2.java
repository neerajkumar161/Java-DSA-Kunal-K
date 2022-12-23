package binary_search_2d_arrays;

import java.util.Arrays;

public class binart_2d_2 {
  public static void main(String[] args) {
    int[][] arr = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    System.out.println(Arrays.toString(search(arr, 3)));
  }

  /* Perform the Binary Search in specific col, when two rows are remained */
  static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
    while (cStart <= cEnd) {
      int middle = cStart + (cEnd - cStart) / 2;
      if (matrix[row][middle] == target) {
        return new int[] { row, middle };
      }
      if (matrix[row][middle] < target) {
        cStart = middle + 1;
      } else {
        cEnd = middle - 1;
      }
    }

    return new int[] { -1, -1 };

  }

  static int[] search(int[][] matrix, int target) {
    int rows = matrix.length;
    int cols = matrix[0].length; // check if columns are empty

    if (rows == 1) {
      return binarySearch(matrix, 0, 0, cols - 1, target);
    }

    int rStart = 0;
    int rEnd = rows - 1;
    int cMiddle = cols / 2;

    // Run the loop until 2 rows remained
    while (rStart < rEnd - 1) { // means having more than two rows
      int middle = rStart + (rEnd - rStart) / 2;
      if (matrix[middle][cMiddle] == target) {
        return new int[] { middle, cMiddle };
      }
      if (matrix[middle][cMiddle] < target) {
        rStart = middle;
      } else {
        rEnd = middle;
      }
    }

    // After completing while loop, we have now two rows
    // check whether the target is in the col of 2 rows
    if (matrix[rStart][cMiddle] == target) {
      return new int[] { rStart, cMiddle };
    }

    if (matrix[rStart + 1][cMiddle] == target) {
      return new int[] { rStart + 1, cMiddle };
    }

    // Search in 1st Half
    if (target == matrix[rStart][cMiddle - 1]) {
      return binarySearch(matrix, rStart, 0, cMiddle - 1, target);
    }
    // Search in 2nd Half
    if (target >= matrix[rStart][cMiddle + 1] && target <= matrix[rStart][cols - 1]) {
      return binarySearch(matrix, rStart, cMiddle + 1, cols - 1, target);
    }
    // Search in 3rd Half
    if (target <= matrix[rStart + 1][cMiddle - 1]) {
      return binarySearch(matrix, rStart + 1, 0, cMiddle - 1, target);
    }
    // Search in 4th Half
    // if(target == matrix[rStart + 1][cMiddle + 1]){
    else {
      return binarySearch(matrix, rStart + 1, cMiddle + 1, cols - 1, target);
    }

  }
}
