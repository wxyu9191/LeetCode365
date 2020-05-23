package dynamic;

/**
 * @Author: balabala
 * @Date: 2020/2/24 9:41 AM
 */

public class SplitStringV2 {
    public int minCut(String s) {
        if(s == null || s.length() == 0) return 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        int[] min_i = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            //最差的情况是划分为i个
            min_i[i] = i;
            for(int j = 0; j <= i; j++){
                if(s.charAt(i) == s.charAt(j) && (i-j < 2 || dp[j+1][i-1] == true)){
                    dp[j][i] = true;
                    //这里的意思是如果j到i时回文，那么在0到j已经处理完的情况下，
                    //0到i这种之前的划分和现在0到j，j到i哪个划分次数更小
                    //j等于0是，不需要划分，即0到0是回文
                    min_i[i] = j == 0 ? 0 : Math.min(min_i[i], min_i[j-1] + 1);
                }
            }
        }
        return min_i[s.length()-1];
    }
}
