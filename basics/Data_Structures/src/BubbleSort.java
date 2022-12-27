import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    // int[] arr = { 1, 2, 3, 4, 5, 6 };
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void bubbleSort(int[] arr) {
    boolean isSwapped;
    for (int i = 0; i < arr.length; i++) {
      isSwapped = false;
      for (int j = 1; j < arr.length - i; j++) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
          isSwapped = true;
        }
      }
      if (!isSwapped) { // if isSwapped is false, which means array is already in Step onee, so we will
                        // break the loop
        break;
      }
    }
  }
}
