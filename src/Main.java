import recursion.RerverseChar;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        char []text = {'h','e','l','l','o'};
        char []res = RerverseChar.reverseChar(text);
        Arrays.sort(text);
        Arrays.fill(text, 'a');
//        System.out.println(res);
        System.out.println(text);
    }
}
