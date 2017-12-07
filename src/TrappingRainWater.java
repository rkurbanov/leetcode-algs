public class TrappingRainWater {
    public int trap(int[] height) {
        int water = 0;
        int l = height.length;

        int i = 0;
        while( i < l-1) {
            int tmax = i;
            int tmaxheight = 0;

            for (int j = i + 1; j < l; j++) {
                if (height[i] <= height[j]) {
                    water += calculate(height, i, j, height[i]);
                    i = j;
                    tmax = i;
                    break;
                } else if (tmaxheight < height[j]) {
                    tmax = j;
                    tmaxheight = height[j];
                }
            }

            if (tmax > i) {
                water += calculate(height, i, tmax, height[tmax]);
                i = tmax;
            }

        }

        return water;
    }

    private int calculate(int[] a, int i, int j, int height) {
        int total = 0;

        for ( int k= i+1; k < j; k++) {
            total += height - a[k];
        }

        return total;
    }
}
