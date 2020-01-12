package recursion;

/**
 * @Author: balabala
 * @Date: 2019/12/12 12:19 AM
 */

public class PrintReverse {
    private static void printReverse(char[] str) {
        helper(0, str);
    }

    private static void helper(int index, char[] str) {
        if (str == null || index >= str.length) {
            return;
        }
        helper(index+1, str);
        System.out.println(str[index]);
    }
}
