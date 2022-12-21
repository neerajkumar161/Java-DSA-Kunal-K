import java.util.Arrays;

public class LinearSearch {
  public static void main(String[] args) {

    int[] numsArr = { 23, 45, 56, 23, 78, 770, 3366 };
    // int[] numsArr = {};
    int result = algorithm(numsArr, 770);
    System.out.println("Linear Search: " + result);

    String name = "Neeraj";
    boolean strResult = stringSearch(name, 'j');
    System.out.println("String Search: " + strResult);

    int rangeSearch = searchInRange(numsArr, 770, 0, 4);
    System.out.println("Search In Range: " + rangeSearch);

    int[][] twoDArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 80, 9 } };
    int[] twoDArraySearch = searchIn2DArray(twoDArray, 9);
    System.out.println("Search in 2D Array: " + Arrays.toString(twoDArraySearch));

    int maxIntwoDArray = maxIn2DArray(twoDArray);
    System.out.println("Max in 2D Array: " + maxIntwoDArray);

    // boolean isEvenDigitsNum = containsEvenDigits(129880);
    // System.out.println("IsEven: " + isEvenDigitsNum);
    // Leetcode Problem
    int[] numsArr2 = { 12, 123, 1234, 12345, 123456, 123456, 12 };
    int numOfEvenDigitsInArray = findEvenNumOfDigits(numsArr2);
    System.out.println("Even no of digits in array: " + numOfEvenDigitsInArray);

    // LeetCode MaxWealth Problem
    int maxWealthAmount = maxWealth(twoDArray);
    System.out.println("Max Wealth Amount: " + maxWealthAmount);
  }

  static int algorithm(int[] arr, int target) {
    if (arr.length == 0)
      return -1;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target)
        return i;
    }

    // No Element found
    return -1;
  }

  static boolean stringSearch(String str, char target) {
    if (str.length() == 0)
      return false;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target)
        return true;
    }

    return false;
  }

  // Search in Range [1, 4] index
  static int searchInRange(int[] arr, int target, int start, int end) {
    if (end > arr.length || start < 0 || arr.length == 0)
      return -1;

    for (int i = start; i <= end; i++) {
      if (arr[i] == target)
        return 1;
    }

    return -1;
  }

  static int minElement(int[] arr) {
    int minEl = arr[0];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < minEl)
        minEl = arr[i];
    }

    return minEl;
  }

  static int[] searchIn2DArray(int[][] arr, int target) {
    if (arr.length == 0)
      return new int[] {};

    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (arr[row][col] == target)
          return new int[] { row, col };
      }
    }

    return new int[] {};
  }

  static int maxIn2DArray(int[][] arr) {
    if (arr.length == 0)
      return 0;

    int max = Integer.MIN_VALUE;

    for (int[] rowElement : arr) {
      for (int colElement : rowElement) {
        if (colElement >= max)
          max = colElement;
      }
    }

    return max;
  }

  /*
   * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
   * Input: nums = [12,345,2,6,7896]
   * Output: 2
   */

  static int findEvenNumOfDigits(int[] arr) {
    int count = 0;
    for (int num : arr) {
      if (containsEvenDigits(num))
        count++;
      // if (containsEvenDigitsLog10(num))
      // count++;
    }
    return count;
  }

  static boolean containsEvenDigits(int num) {
    // 1. Count the no of digits
    // 2. Convert to String and check length
    // 3. Using Logrithmic 10
    if (num < 0)
      num *= -1;

    int count = 0;
    while (num > 0) {
      num = num / 10;
      count++;
    }
    return count % 2 == 0;
  }

  static boolean containsEvenDigitsLog10(int num) {
    if (num < 0)
      num *= -1;
    // More Optimized, 1234 -> log10 -> 3.00 something
    return (((int) Math.log10(num) + 1)) % 2 == 0;
  }

  /*
   * Max Wealth LeetCode Problem
   * https://leetcode.com/problems/richest-customer-wealth/
   * Input: accounts = [[1,2,3],[3,2,1]]
   * Output: 6
   */

  static int maxWealth(int[][] arr) {
    int max = 0;
    for (int[] account : arr) {
      int sum = 0;
      for (int amount : account) {
        sum += amount;
      }
      if (sum >= max)
        max = sum;
    }
    return max;
  }

}