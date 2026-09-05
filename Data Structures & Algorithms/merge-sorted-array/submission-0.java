class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int l = 0;
        int r = 0;
        int count = 0;
        while(l < m && r < n){
            if(nums1[l] < nums2[r]){
                arr[count++] = nums1[l++];
            }else{
                arr[count++] = nums2[r++];
            }
        }
        while(l < m){
            arr[count++] = nums1[l++];
        }
        while(r < n){
            arr[count++] = nums2[r++];
        }
        for(int i = 0;i < m+n;i++){
            nums1[i] = arr[i];
        }
    }
}