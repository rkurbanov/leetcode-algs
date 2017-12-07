public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int l = nums.length;

        int i = 0;
        while(i < l){
            if( nums[i] != i+1 && nums[i] > 0 && nums[i] <= l &&  i != nums[i]-1 && nums[i] != nums[nums[i]-1]) {
                swap(nums, i, nums[i]-1);
                continue;
            }

            ++i;
        }

        for(int j = 0; j < l; j++ ) {
            if (j+1 != nums[j]) return j+1;
        }

        return l+1;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
