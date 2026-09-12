class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int weight : weights){
            low = Math.max(weight,low);
            high += weight;
        }
        int answer = high;
        while(low <= high){
            int mid = low + (high-low)/2;
            int daysNeeded = 1;
            int currentWeight = 0;
            for(int weight : weights){
                if(currentWeight + weight > mid){
                    daysNeeded++;
                    currentWeight = weight;
                }else{
                    currentWeight += weight;
                }
            }
            if(daysNeeded <= days){
                answer = mid;
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        return answer;
    }
}