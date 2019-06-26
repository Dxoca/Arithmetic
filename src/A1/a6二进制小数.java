package A1;

public class a6二进制小数 {
    //0-1之间的浮点实数的二进制比的二进制表示
    //如果该数字无法精确的使用32位以内的二进制表示则，打印Error；
    public static void main(String[] args){
        double n=0.625;
        StringBuilder sb = new StringBuilder("0.");
        while(n>0){
            double r=n*2;//乘2 （挪整）判断整数部分 大于1 追加1 消去1
            if(r>=1){
                sb.append("1");
                n=r-1;
            }
            else{
                sb.append("0");
                n=r;
            }
            //位数保持
            if(sb.length()>34){
                System.out.println("ERROR");
                return;
            }
        }
        //说明小于32位
        System.out.println(sb.toString());
    }

}
