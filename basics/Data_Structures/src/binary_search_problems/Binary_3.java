package binary_search_problems;

public class Binary_3 {
  public static void main(String[] args) {
    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    char[] arr = { 'c', 'f', 'j' };
    char target = 'c';
    char result = nextGreatestLetter(arr, target);
    System.out.println(result);
  }

  static char nextGreatestLetter(char[] letters, char target) {
    int start = 0;
    int end = letters.length - 1;
    // Binary Search
    while (start <= end) {
      int middle = start + ((end - start) / 2);
      if (target < letters[middle])
        end = middle - 1;
      else
        start = middle + 1;
    }
    // same as if(start > end + 1) then return first element otherwise the element.
    // [3 % 4 = 3] || [4 % 4]
    return letters[start % letters.length];
  }
}
