/**
 * Created by wangjianchao1 on 2017/6/27.
 */
public class Main {
    public static void main(String[] args) {
        int cap = 16;
        int n = cap - 1;
        System.out.println(n);
        n |= n >>> 1;
        System.out.println(n);
        n |= n >>> 2;
        System.out.println(n);
        n |= n >>> 4;
        System.out.println(n);
        n |= n >>> 8;
        System.out.println(n);
        n |= n >>> 16;
        System.out.println(n);

        System.out.println(Long.MAX_VALUE);
    }
}
