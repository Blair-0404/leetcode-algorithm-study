package SingleNumber;

class SingleNumberUni {
  public static void main(String[] args) {
    SingleNumberUni SN = new SingleNumberUni();
    int[] nums = { 4, 1, 2, 1, 2 };

    int result = SN.getSingleNum(nums);

    System.out.println(result);
  }

  private int getSingleNum(int[] nums) {
    int result = 0;

    for (int num : nums) {
      result ^= num;
    }

    return result;
  }
}
