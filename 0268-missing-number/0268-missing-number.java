class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int sumR = n * (n+1)/2;

        int sumN = 0;

        for(int num : nums){
            sumN = sumN + num;

        }

        return sumR - sumN;

    //TC = O(n)
    //SC = O(1)
    }
}