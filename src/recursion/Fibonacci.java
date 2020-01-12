package recursion;

import java.util.HashMap;

/**
 * @Author: balabala
 * @Date: 2019/12/30 12:00 AM
 */

public class Fibonacci {
    HashMap<Integer, Integer> cache = new HashMap<>();
    public int fib(int N){
        if (cache.containsKey(N)){
            return cache.get(N);
        }
        int res;
        if (N < 2){
            return N;
        }else {
            res = fib(N-1) + fib(N-2);
        }
        cache.put(N, res);
        return res;
    }
}
