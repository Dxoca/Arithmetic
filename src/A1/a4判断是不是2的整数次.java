package A1;

public class a4判断是不是2的整数次 {//他的二进制只有一个1 所以 (N-1)^N;除去最后一个1=0
    public static void main(String[] args) {
        int i = 7;
        System.out.println(Integer.toString(i, 2));
        if (((i - 1) & i) == 0) {//1 2 4 8 16 一个数字只有一个1
            System.out.printf("%s\n", "是2的整数次");
        } else
            System.out.println("NO");

    }
}
