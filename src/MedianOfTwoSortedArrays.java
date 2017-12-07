public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums1M = getMiddle(nums1);
        int[] nums2M = getMiddle(nums2);

        return median(merge(nums1M, nums2M));
    }

    private int[] merge(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length];
        int i = 0, j = 0;

        for (int k = 0; k < res.length; k++) {
            if (a1[i] <= a2[j]) res[i] = a1[i++];
            else if (a1[i] > a2[j]) res[i] = a2[j++];
        }

        return res;
    }

    private double median(int[] nums) {
        int l = nums.length;
        if (l % 2 == 0 ) {
            return (nums[l/2-1] + nums[l/2])/2.0;
        } else {
            return nums[l/2];
        }
    }

    private int[] getMiddle(int[] nums) {
        int l = nums.length;

        if(l == 0) return new int[]{};
        else if(l % 2 == 0 ) return new int[]{nums[l/2-1], nums[l/2]};
        else return new int[] {nums[l/2]};
    }
}
