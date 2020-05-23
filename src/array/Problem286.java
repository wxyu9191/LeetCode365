package array;

/**
 * @Author: balabala
 * @Date: 2020/3/30 11:05 PM
 * 缺失的数字
 */

public class Problem286 {
    public int missingNumber(int[] nums) {
        int res = -1;
        int[] temp = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            temp[nums[i]] = 1;
        }
        for(int i = 0; i < temp.length; i++){
            if(temp[i] == 0){
                return i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Problem286 t = new Problem286();
        int[] test = new int[]{3, 0, 1};
        int x = t.missingNumber(test);
        System.out.println(x);
    }
}
