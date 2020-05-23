package dynamic;

/**
 * @Author: balabala
 * @Date: 2020/4/6 11:15 AM
 */

public class Problem42 {
    public int trap(int[] height) {
        int res = 0;
        for (int i = 1; i < height.length; i++) {
            int leftMax=0;
            int rightMax=0;
            for (int j = 0; j < i; j++) {
                if (height[j] > leftMax){
                    leftMax = height[j];
                }
            }
            for (int j = i+1; j < height.length; j++) {
                if (height[j] > rightMax){
                    rightMax = height[j];
                }
            }

            res += Math.min(leftMax, rightMax) > height[i] ? Math.min(leftMax, rightMax) - height[i] : 0;
        }
        return res;
    }
}
