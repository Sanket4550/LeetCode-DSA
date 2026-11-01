class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[128];
        int left = 0;
        int maxLength = 0;

        for (int right=0; right<s.length();right++) {
            char ch = s.charAt(right);

            left=Math.max(left,lastSeen[ch]);

            maxLength=Math.max(maxLength,right-left+1);

            lastSeen[ch]=right+1;
        }

        return maxLength;

        //tc = O(N)
        //sc = O(1)
    }
}