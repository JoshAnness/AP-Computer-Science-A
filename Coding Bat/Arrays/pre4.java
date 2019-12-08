public int[] pre4(int[] nums) {
  int f = 0;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] != 4)
      f++;
    else
      break;
  }
  int[] n = new int[f];
  for(int j = 0; j < n.length; j++)
    n[j] = nums[j];
  return n;
}
