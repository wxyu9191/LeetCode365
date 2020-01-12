package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: balabala
 * @Date: 2019/12/16 10:52 PM
 * 杨辉三角
 */

public class GenerateTrangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> cur = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            cur = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == i || j == 0) {
                    cur.add(1);
                } else {
                    cur.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = cur;
        }
        return cur;
    }

    public static void main(String[] args) {
        GenerateTrangle2 demo = new GenerateTrangle2();
        System.out.println(demo.getRow(4));
    }
}