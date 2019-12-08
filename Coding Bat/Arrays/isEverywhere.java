public boolean isEverywhere(int[] nums, int val) {
  for(int i = 1; i < nums.length; i++) {
    if(nums[i] != val)
      if(nums[i-1] != val)
        return false;
  }
  return true;
}
