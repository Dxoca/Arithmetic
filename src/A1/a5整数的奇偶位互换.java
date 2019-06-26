package A1;

public class a5整数的奇偶位互换 {//java  二进制转换字符串
    //与运算 0 消除 1 保留
    //Integer.toBinaryString()进制转换
    public static void main(String[] args) {
        int a=0b01000000_00000000_00000000_00000000;
        int b=m(a);
        System.out.println(Integer.toBinaryString(a)+"\n"+Integer.toString(b,2));
        System.out.println(a);
        System.out.println(b);
    }
    private static int m(int i){
        int even=i&0xaaaaaaaa;//1010 保留偶数位
        int odd =i&0x55555555;//0101
        return (even>>1)^(odd<<1);//偶数右移 奇数左移 异或
    }



}
