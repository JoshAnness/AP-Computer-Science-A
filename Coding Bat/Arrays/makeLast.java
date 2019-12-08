public int[] makeLast(int[] nums) {
  int last = nums[nums.length-1];
  int[] num = new int[(nums.length*2)];
  
  num[num.length-1] = last;
  return num;
}
