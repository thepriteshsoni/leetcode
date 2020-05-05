package pks.programming.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*

The problem statement for this code can be found below as well as on LeetCode website here: https://leetcode.com/problems/two-sum/

  Given an array of integers, return indices of the two numbers such that they add up to a specific target.

  You may assume that each input would have exactly one solution, and you may not use the same element twice.

  Example:

  Given nums = [2, 7, 11, 15], target = 9,

  Because nums[0] + nums[1] = 2 + 7 = 9,
  return [0, 1].

*/

/**
 * @author Pritesh Soni
 *
 */
public class LeetCodeProblem1 {

  public int[] twoSum(int[] nums, int target) {
    int[] resultArr = new int[2];
    int result1 = 0, result2 = 0, temp;
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    map.put(target - nums[0], 0);
    for (int i = 1; i < nums.length; i++) {
      temp = nums[i];
      if (map.containsKey(temp)) {
        result1 = map.get(temp);
        result2 = i;
        break;
      } else {
        map.put(target - temp, i);
      }
    }
    resultArr[0] = result1;
    resultArr[1] = result2;
    return resultArr;
  }

  public static void main(String[] args) {
    int[] nums = new int[] {2, 7, 11, 15};
    int target = 9;
    LeetCodeProblem1 LeetCodeProblem1 = new LeetCodeProblem1();
    System.out.println(Arrays.toString(LeetCodeProblem1.twoSum(nums, target)));
  }

}

/*

  Solution Analysis & Stats (provided by leetCode:

  Runtime: 1 ms (Faster than 99.92% of leetCode Java submissions)
  Memory Usage: 39.4 MB

*/
