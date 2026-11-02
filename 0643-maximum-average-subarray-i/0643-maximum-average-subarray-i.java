class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        double sum = 0;
        double maxAvg = Double.NEGATIVE_INFINITY;

        for(int j = 0; j < nums.length; j++){
            sum += nums[j];

            if(j - i + 1 == k){
                maxAvg = Math.max(maxAvg, sum/k);
                sum -= nums[i];
                i++;
            }
        }
        return maxAvg;

        //O(N)
        //O(1)
    }
}