class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i < nums.length-2;i++){
            int l = i+1;
            int r = nums.length-1;
            if(i > 0 && nums[i-1] == nums[i]) continue;
            while(l < r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l < r && nums[l-1] == nums[l]) l++;
                    while(l < r && nums[r+1] == nums[r]) r--;
                }
                if(sum < 0){
                    l++;
                }
                if(sum > 0){
                    r--;
                }
            }
        }
        return res;
    }
}
