import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    // Useful for small arrays or small elements
    int[] arr = { 8, -23, 3 };
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      /*
       * First find greatest element in array then swap with last element
       * or find smallest element in array then swap with first element
       */
      int lastIndex = arr.length - i - 1;
      int maxIndex = getMaxIndex(arr, 0, lastIndex);
      swapArray(arr, maxIndex, lastIndex);
    }
  }

  static void swapArray(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }

  private static int getMaxIndex(int[] arr, int start, int end) {
    int max = start;
    for (int i = start; i <= end; i++) {
      if (arr[max] < arr[i])
        max = i;
    }

    return max;
  }
}
