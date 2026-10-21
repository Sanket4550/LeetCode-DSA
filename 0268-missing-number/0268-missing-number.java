class Solution {
    public int missingNumber(int[] nums) {
        // (3 0 1)
        // mN = 0
        int missingNumber = 0;

        // 0 1 2
        //[3 0 1]
        // i
        // mN = 0 ^ (0 ^ 3) ^ (1 ^ 0) ^ (2 ^ 1) ^ (3)

        for (int i = 0; i < nums.length; i = i + 1){
            missingNumber = missingNumber ^ (i ^ nums[i]);
        }

        return missingNumber ^ nums.length;

        //tc = O(n) 
        //sc = O(1)
    }
}