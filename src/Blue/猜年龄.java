package Blue;
/**
 * Dxoca.cn
 */

import java.util.HashSet;
import java.util.Set;

public class 猜年龄 {
    public static void main(String[] args) {
        // 年龄 这个数的立方是四位数，四次方是六位数 这些数字都包含了0-9 是个数字
        for (int i = 1; i <= 100; i++) {
            Integer k = i * i * i;
            int l = k * i;
            String k1 = k + "";//或者Integer.toString(k);来转化为字符
            String l1 = l + "";//java通过+字符串 直接转化为字符格式
            if (k1.length() == 4 && l1.length() == 6 && check2(k1 + l1) && check(k1 + l1)) {//两种方法进行比较
                System.out.println(i);
                break;
            }
        }
    }
    private static boolean check2(String s) {
        int[] mark = new int[10];//0-9//记录每个数字出现的次数
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == (char) (i + 48)) {//0的ASCII码是 48
                mark[i]++;
                if (mark[i] == 2)
                    return false;//else说明所有数字通过
            }
        }
        return true;
    }

    private static boolean check(String s) {
        Set<Character> set = new HashSet<Character>();//用HashSet方法去重复
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));//每一个字母都加进进去
        }
        return set.size() == 10;//0-9十个数字都在
    }
}
