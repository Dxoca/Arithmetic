package A1;

public class a2找出落单的数字 {
    //某个数字之外其他数字都出现两次的这个数字
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 5, 5, 6, 6};//2
        int[] arr2 = {1, 1, 2, 3, 3, 4, 4, 5, 5, 6, 6,4};//4
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            x ^= arr[i];
        }//相同为0 相同的数字全部清除 一对一对的。
        System.out.println(x);
        for (int i = 0; i < arr2.length; i++) {
            x ^= arr2[i];
        }
        System.out.println(x);
    }
}
