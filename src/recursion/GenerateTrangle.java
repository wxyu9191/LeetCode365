package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: balabala
 * @Date: 2019/12/16 10:52 PM
 */

public class GenerateTrangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> trangleList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            trangleList.add(generateList(i + 1));
        }

        return trangleList;
    }
    public List<Integer> generateList(int size) {
        List<Integer> list = new ArrayList<>(size);
        // 每一行第一元素都为1
        list.add(1);
        // 递归出口
        if(size == 1) {
            return list;
        }
        // 递归调用
        List<Integer> prev = generateList(size - 1);
        for(int i = 1; i < size - 1; i++) {
            list.add(prev.get(i) + prev.get(i - 1));
        }
        // 每一行最后一个元素也都为1
        list.add(1);
        return list;
    }

    public static void main(String[] args) {
        GenerateTrangle demo = new GenerateTrangle();
        System.out.println(demo.generate(2));
    }
}