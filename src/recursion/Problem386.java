package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: balabala
 * @Date: 2020/3/31 9:31 AM
 * 给定一个数n，对1-n字典排序
 */

public class Problem386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < 10; i++){
            if (i <= n){
                res.add(i);
                addExtend(res, n, i);
            } else {
                break;
            }
        }
        return res;
    }

    private void addExtend(List<Integer> res, int n, int startIndex) {
        startIndex = startIndex * 10;
        for (int i = 0; i < 10; i++, startIndex++){
            if (startIndex <= n){
                res.add(startIndex);
                addExtend(res, n, startIndex);
            }else {
                return;
            }
        }
    }

}
