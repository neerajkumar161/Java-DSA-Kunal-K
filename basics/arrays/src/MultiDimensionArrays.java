import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.standard.MultipleDocumentHandling;

public class MultiDimensionArrays {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // int[][] multiDimension = new int[3][3];// 3x3 Array
    // rows, columns

    // int[][] multiDimension = {
    // { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
    // };

    int[][] multiDimension = new int[3][3];

    // System.out.println(Arrays.toString(multiDimension));
    // for (int rows : multiDimension[0]) {
    // for (int col : multiDimension[1]) {
    // System.out.print(multiDimension[rows]);
    // }
    // }

    for (int row = 0; row < multiDimension.length; row++) {
      for (int col = 0; col < multiDimension[row].length; col++) {
        multiDimension[row][col] = in.nextInt();
      }
    }

    in.close();

    // for (int[] element : multiDimension) {
    // System.out.print("[ ");
    // for (int col = 0; col < element.length; col++) {
    // // multiDimension[row][col] = in.nextInt();
    // System.out.print(element[col] + " ");
    // }
    // System.out.print("]");
    // System.out.print("\n");
    // }

    for (int[] element : multiDimension) {
      System.out.print(Arrays.toString(element) + "\n");
    }
  }
}