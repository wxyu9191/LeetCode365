package dynamic;

import java.util.Arrays;

/**
 * @Author: balabala
 * @Date: 2020/2/23 10:52 PM
 * <p>
 * 132. 分割回文串 II
 * 给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
 * <p>
 * 返回符合要求的最少分割次数。
 * 输入: "aab"
 * 输出: 1
 * 解释: 进行一次分割就可将 s 分割成 ["aa","b"] 这样两个回文子串。
 * <p>
 * 如果是'abc'是2次
 */

public class SplitString {

    public static void main(String[] args) {
        SplitString test = new SplitString();
        test.minCut("abccba");
    }

    public int minCut(String s) {
        int len = s.length();
        if (len < 2) {
            return 0;
        }

        int[] dp = new int[len];
        // 初始化，默认每个字符都不同，那么就是最少要减len-1次
        for (int i = 0; i < len; i++) {
            dp[i] = i;
        }

        for (int i = 1; i < len; i++) {
            if (checkPalindrome(s, 0, i)) {
                dp[i] = 0;
                continue;
            }

            for (int j = 0; j < i; j ++){
                if (checkPalindrome(s, j+1, i)){
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }

        System.out.println(Arrays.toString(dp));
        return dp[len - 1];
    }

    private boolean checkPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

}
