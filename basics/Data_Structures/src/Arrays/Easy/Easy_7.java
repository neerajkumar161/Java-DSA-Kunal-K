package Arrays.Easy;

import java.util.HashMap;

public class Easy_7 {

  public static int sumOfNumbers = 0;

  public static void main(String[] args) {
    /*
     * https://leetcode.com/problems/number-of-good-pairs/
     * Given an array of integers nums, return the number of good pairs.
     * 
     * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,3,1,1,3]
     * Output: 4
     * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
     */
    // int[] arr = { 1, 2, 3, 1, 1, 1, 3, 1, 3, 4, 4 };
    int[] arr = { 1, 2, 3 };
    int result = numIdenticalPairsOptimized(arr); // not working in ide
    System.out.println(result);

  }

  public int numIdenticalPairs(int[] nums) {
    int goodPairs = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j])
          goodPairs++;
      }
    }
    return goodPairs;
  }

  static int numIdenticalPairsOptimized(int[] nums) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    int maxLengthForIndexValuePairs = 0;
    for (int i = 0; i < nums.length; i++) {
      // find Value key pair in hashMap first
      if (hashMap.get(nums[i]) == null) {
        hashMap.put(nums[i], 1);
        maxLengthForIndexValuePairs = 1;
      } else {
        int keyvalue = hashMap.get(nums[i]);
        keyvalue++;
        if (maxLengthForIndexValuePairs <= keyvalue)
          maxLengthForIndexValuePairs = keyvalue;
        System.out.println("Key " + nums[i] + " Value " + keyvalue);
        hashMap.put(nums[i], keyvalue);
      }
    }
    int[] noOfCountsElements = getIndexValuePairs(maxLengthForIndexValuePairs + 1);

    hashMap.forEach((key, value) -> {
      System.out.println(key + " " + value);
      sumOfNumbers += noOfCountsElements[value];
    });
    return sumOfNumbers;
  }

  static int[] getIndexValuePairs(int length) {
    int[] valuePairs = new int[length];

    for (int i = 0; i < valuePairs.length; i++) {
      if (i > 0 && i < valuePairs.length) {
        valuePairs[i] = valuePairs[i - 1] + (i - 1);
      }
    }

    return valuePairs;
  }

}
