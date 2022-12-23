package binary_search_2d_arrays;

import java.util.Arrays;

public class binary_2d_1 {
  // Binary Search in Sorted column wise array
  public static void main(String[] args) {
    int[][] arr = {
        { 10, 20, 30, 40 },
        { 15, 25, 35, 45 },
        { 28, 29, 37, 49 },
        { 33, 34, 38, 50 }
    };

    int result[] = search(arr, 37);
    System.out.println(Arrays.toString(result));
  }

  static int[] search(int[][] matrix, int target) {
    int row = 0;
    int col = matrix.length - 1;

    while (row < matrix.length && col >= 0) {
      if (matrix[row][col] == target) {
        return new int[] { row, col };
      }
      if (matrix[row][col] < target) {
        row++;
      } else {
        col--;
      }
    }

    return new int[] { -1, -1 };
  }
}