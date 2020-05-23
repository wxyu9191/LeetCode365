package list;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: balabala
 * @Date: 2020/5/23 10:15 上午
 */
public class Pro78 {
    public String minWindow(String s, String t) {
        Map<Character, Integer> target = new HashMap<>();
        Map<Character, Integer> windows = new HashMap<>();
        char[] strs = t.toCharArray();
        for(char c: strs){
            // 可有重复字符
            target.put(c, target.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int valids = 0;

        int start = 0, len = Integer.MAX_VALUE;
        while(right < s.length()){
            char c = s.charAt(right);
            if(target.containsKey(c)){
                // 是目标字符，就更新滑动窗口的value
                windows.put(c, windows.getOrDefault(c, 0) + 1);
                // 滑动窗口中的目标字符value == target中的value时候，更新valid，一个字符只会更新一次。
                if(windows.get(c) == target.get(c)){
                    valids ++;
                }
            }
            //左闭右开
            right ++;
            //
            while(valids == target.size()){
                if(right - left < len){
                    start = left;
                    len = right - left;
                }
                char l = s.charAt(left);
                left ++;
                if(target.containsKey(l)){
                    if(windows.get(l) == target.get(l)){
                        valids --;
                    }
                    windows.put(l, windows.get(l) - 1);
                }
            }

        }

        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
    public static void main(String[] args) {
        Pro78 t = new Pro78();
        System.out.printf(t.minWindow("aa", "aa"));
    }
}