class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            if(i == 0){
                prefix[i] = nums[i];
            }else{
                prefix[i] = prefix[i-1]+nums[i];
            }
        }
        for(int i = 0;i < nums.length;i++){
            if(sumInRange(0,i-1,prefix) == sumInRange(i+1,nums.length-1,prefix)) return i;
        }
        return -1;
    }
    public int sumInRange(int L,int R,int[] prefix){
        if(L > R) return 0;
        if(L <= 0) return prefix[R];
        return prefix[R] - prefix[L-1];
    }
}