package Searching.Easy;

public class Easy_1 {
  public static void main(String[] args) {
    /*
     * https://leetcode.com/problems/sqrtx/
     * Given a non-negative integer x, return the square root of x rounded down to
     * the nearest integer. The returned integer should be non-negative as well.
     * 
     * You must not use any built-in exponent function or operator.
     * 
     * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
     * 
     * 
     * Example 1:
     * 
     * Input: x = 4
     * Output: 2
     * Explanation: The square root of 4 is 2, so we return 2.
     * Example 2:
     * 
     * Input: x = 8
     * Output: 2
     * Explanation: The square root of 8 is 2.82842..., and since we round it down
     * to the nearest integer, 2 is returned.
     */
    int result = mySqrt(8);
    System.out.println(result);
  }

  // Using Binary Search Approach
  static int mySqrt(int x) {
    long low = 0;
    long high = x;
    long ans = 0;
    while (low <= high) {
      long mid = (low + high) / 2;
      if (mid * mid < x) {
        low = mid + 1;
        ans = mid;
      } else if (mid * mid > x) {
        high = mid - 1;
      } else {
        return (int) mid;
      }
    }
    return (int) ans;
  }

}
