public class Main {
    public static void main(String[] args) {
//        MedianOfTwoSortedArrays t = new MedianOfTwoSortedArrays();

//        double res = t.findMedianSortedArrays(new int[]{1, 3}, new int[]{});

//        FirstMissingPositive t = new FirstMissingPositive();
//
//        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};

        int[] arr = {0,1, 0};
        TrappingRainWater trw = new TrappingRainWater();

        int res = trw.trap(arr);

        System.out.println(res);
    }
}
