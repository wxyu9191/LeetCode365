package recursion;

/**
 * @Author: balabala
 * @Date: 2019/12/12 9:05 AM
 */

public class RerverseChar {
    public static char[] reverseChar(char[] str) {
        str = helper(0, str.length - 1, str);
        for (char c : str) {
            System.out.println(c);
        }
        return str;
    }

    private static char[] helper(int left, int right, char[] str) {
        if (left - right > 0) {
            return str;
        }
        str = helper(left + 1, right - 1, str);
        char tmp = str[left];
        str[left] = str[right];
        str[right] = tmp;
        return str;
    }
}
