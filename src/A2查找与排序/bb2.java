package A2查找与排序;
//小白正在上楼梯，楼梯有n阶台阶，小白一次一次可以上1阶，2阶或3阶，实现一个方法，计算小白有多少种走完楼梯的方式。
public class bb2 {
    public static void main(String[] args) {
        up(3);
        System.out.println(count);
    }
    static int count;
    static void up(int n){
        if(n==0) {
            count++;
        }
        if(n-3>=0)//可以走
            up(n-3);
        if(n-2>=0)
            up(n-2);
        if(n-1>=0)
            up(n-1);
    }
}
