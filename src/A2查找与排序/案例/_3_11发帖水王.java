package A2查找与排序.案例;

public class _3_11发帖水王 {
    //id数超过总数的一般
    public static void main(String[] args) {
        int[] arr={2,2,2,1,1,2,2,8,1,8};//ID个数等于一半 的水王
        solve2(arr);
    }
    public static void solve2(int arr[]){//
        int condidate=arr[0];//候选
        int nTimes=1;//出现的次数
        int countOfLast =0;//最后一个元素计数
        for (int i = 1; i < arr.length; i++) {
            if(arr[arr.length-1]==arr[i]){
                //计数最后一个元素出现的次数
                countOfLast++;
            }
            if(nTimes==0){//没有1-1 抵消 换另一个 擂台 相同消除
                nTimes=1;//恢复Recover
                condidate=arr[i];
                continue;
            }

            if(arr[i]==condidate){
                nTimes++;
            }else{
                nTimes--;
            }
        }
        if(countOfLast==arr.length/2)//等于数组的一般 则 就是最后一个数 反之
            System.out.println(arr[arr.length-1]);
        else
            System.out.println(condidate);//活下来的 也就是 最后一个condidate 倒数第二个数
    }
}
