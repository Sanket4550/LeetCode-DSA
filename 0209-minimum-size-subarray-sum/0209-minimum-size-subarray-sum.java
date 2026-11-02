class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0,j = 0;
        int minlength = Integer.MAX_VALUE;
        int sum = 0;

        while(j < n){
            sum += nums[j];

            while(sum >= target){
                minlength = Math.min(minlength, j-i+1);

                sum -= nums[i];

                i++;
            }

            j++;
        }

        return minlength == Integer.MAX_VALUE ? 0 : minlength;


        // Time O(N)
        //Space O(1)
        //sliding window mik
    }
}