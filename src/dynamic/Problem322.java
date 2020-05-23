package dynamic;

import java.util.Arrays;

/**
 * @Author: balabala
 * @Date: 2020/4/19 10:16 PM
 * 💰兑换问题
 */

public class Problem322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1]; // 0 ~ amount
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]){
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Problem322 p = new Problem322();
        int res = p.coinChange(new int[]{2}, 3);
        System.out.println(res);
    }
}
