public boolean sameEnds(int[] nums, int len) {
  int i = 0;
  for(int j = nums.length-len; j < nums.length; j++) {
    if(nums[i] != nums[j])
      return false;
    i++;
  }
  return true;
}
