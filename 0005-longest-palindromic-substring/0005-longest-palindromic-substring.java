class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLen = 0;
        int sp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalin(s, i, j)) {
                    int len = j - i + 1;
                    if (maxLen < len) {
                        maxLen = len;
                        sp = i;
                    }
                }
            }
        }
        return s.substring(sp, sp + maxLen);
    }

    private static boolean isPalin(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    
        //tc = O(N^2)
        //sc = O(1)
    }
}