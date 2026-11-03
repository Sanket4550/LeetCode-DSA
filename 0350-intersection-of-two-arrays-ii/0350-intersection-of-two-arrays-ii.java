class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length){
            return intersect(nums2,nums1);
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] res = new int[nums1.length];
        int k = 0;

        int i = 0,
            j = 0;

        while( i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                res[k] = nums1[i];
                k = k + 1;
                i = i + 1;
                j = j + 1;
            } else if (nums1[i] >  nums2[j]){
                j = j + 1;
            } else {
                i =  i + 1;
            }
        }
        return Arrays.copyOfRange(res, 0 ,k);

        //Time Complexity: O(m log m), where m is the length of the larger array.
        //Auxiliary Space Complexity: O(log m) for sorting.
        //Output Space Complexity: O(n), where n is the length of the smaller array.
    }
}