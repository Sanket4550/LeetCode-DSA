class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int result = 0;

        int cumsum = 0;// Actual Sum upto the Index
        // If prefixSum - k = 0, it means the subarray starts from index 0.
        // We add (0, 1) to handle this case naturally.
        hm.put(0,1);

        for(int i = 0;i < nums.length; i++){
            cumsum += nums[i];

            int remove = cumsum - k;    // Calculate what previous sum we need to chop off

            // If HashMap contains the exact prefixSum to remove, it means we found valid subarrays
            if(hm.containsKey(remove)){
                result += hm.get(remove);
            }

             // Store/Update the current prefixSum frequency in the map
            hm.put(cumsum,hm.getOrDefault(cumsum, 0) + 1);
        }
        return result;

        //tc,sc = O(N)
        
    }
}