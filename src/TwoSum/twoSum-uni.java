package leetCode;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
  public static void main(String[] args) {
    TwoSum TW = new TwoSum();
    int[] nums = { 1, 2, 7, 11 };
    int target = 13;

    int[] result = TW.getTwoSum(nums, target);

    for (int value : result) {
      System.out.println(value);
    }
  }

  private int[] getTwoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
      }
      map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}
