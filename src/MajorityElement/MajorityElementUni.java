package MajorityElement;

import java.util.HashMap;

public class MajorityElementUni {
  public static void main(String[] args) {

    MajorityElementUni ME = new MajorityElementUni();
    int[] nums = { 3, 3, 4 };

    System.out.println(ME.majorityElement(nums));
  }

  public int majorityElement(int[] nums) {
    HashMap newMap = new HashMap();
    int resultNumber = nums[0];

    for (int i = 0; i < nums.length; ++i) {
      if (newMap.containsKey(nums[i])) {
        int value = Integer.parseInt(String.valueOf(newMap.get(nums[i]))) + 1;
        newMap.put(nums[i], value);
      } else {
        newMap.put(nums[i], 1);
      }
      if (Integer.parseInt(String.valueOf(newMap.get(nums[i]))) > Integer.parseInt(String.valueOf(newMap.get(resultNumber)))) resultNumber = nums[i];
    }

    return resultNumber;
  }
}
