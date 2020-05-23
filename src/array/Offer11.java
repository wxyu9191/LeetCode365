package array;

/**
 * @Author: balabala
 * @Date: 2020/5/19 8:39 AM
 */

public class Offer11 {
    public int minArray(int[] numbers) {
        int l = 0, r = numbers.length -1 ;
        while(l <= r){
            int mid = (l + r)/2;
            if(numbers[r] < numbers[mid]){
                l = mid + 1;
            }else if (numbers[l] < numbers[mid]){
                r = mid;
            }else {
                r --;
            }
        }
        return numbers[l];
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        Offer11 o = new Offer11();
        System.out.println(o.minArray(arr));
    }
}
