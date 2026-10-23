class Solution {
    public int majorityElement(int[] nums) {
        //as majority elements comes n/2 times then it will be present at n/2 position after sorting

        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];

        //tc = O(n log n)
    }
}