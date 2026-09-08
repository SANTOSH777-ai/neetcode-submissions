class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] soln = new int[2*nums.length];
        for(int i = 0;i < nums.length;i++){
            soln[i] = nums[i];
            soln[i+nums.length] = nums[i];
        }
        return soln;
    }
}