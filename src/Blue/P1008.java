package Blue;

import java.util.HashSet;
import java.util.Set;

public class P1008 {
    public static void main(String[] args) {
        for (int i = 123; i <= 334; i++) { //chaeck2
            String nums = i + " " + i * 2 + " " + i * 3;
            if (check2(nums))//自己构造合适的去重
                System.out.println(nums);
        }
        System.out.println("++++++++++++++++++");
        for (int i = 123; i <= 334; i++) {//check
            String nums = i + " " + i * 2 + " " + i * 3;
            if (check(nums)) //java自带去重复
                System.out.println(nums);
        }
    }

    static boolean check2(String x) {//查重
        int[] mark = new int[10];
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '0')//因为数字中不包括0 所以 到0直接pass 与check2 区分 不能加到到 下面的if中判断
                return false;
            if (x.charAt(i) != ' ' ) {//排除空格
                if (++mark[(int) x.charAt(i) - (int) '0'] == 2)//标记每个数字 =2就是出现了第二次 则flase 重复
                    return false;
            }
        }
        return true;
    }
    static boolean check(String x) { //1-9的数字
        Set<Character> set = new HashSet<Character>();//去重
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != ' ' && x.charAt(i) != '0')//不是空字符串
                set.add(x.charAt(i));
        }
        if (set.size() == 9)
            return true;
        else
            return false;

    }
}
