class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int i = 0;
        int j = 0;
        int x = 0;

        int[] result = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[x++] = nums1[i++];
            } else {
                result[x++] = nums2[j++];
            }
        }

        while (i < m) {
            result[x++] = nums1[i++];
        }
        while (j < n) {
            result[x++] = nums2[j++];
        }
        if ((m + n) % 2 != 0) {
            return (double) result[(m + n) / 2];
        } else {
            return (double) (result[(m + n - 1) / 2] + result[(m + n) / 2]) / 2.0;
        }
    }
}