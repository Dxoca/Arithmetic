package Blue;

import java.util.Scanner;

public class p1308统计单词个数 {
    public static void main(String[] args) {
        //不区分大小写 要求完全匹配
        //返回单词在文章中出现的次数 个第一次出现的位置 单词首字母 位置从0开始
        //没有出现 输出-1
        Scanner cin = new Scanner(System.in);
        String aim = " " + cin.nextLine().toLowerCase() + " ";//小写
        String sourTamp = " " + cin.nextLine().toLowerCase() + " ";//前后 补空格 好判断
//        char[] aims=aim.toCharArray();//咪表字符数组
//        StringBuilder sour=new StringBuilder(sourTamp);//小写
//        funJava(aim, sourTamp);//java内部方法测试
        indexOf(sourTamp,0,aim);
        if(count!=0) {
            System.out.println(count + " " + minIndex);//次数和位置
        }else{
            System.out.println("-1");
        }
    }

    /**
     * @param str   文章
     * @param index 从 index处开始检索
     * @param aim   目标单词
     * @return 如果因为 是字母之间 用空格 为一个单位 如果两个相同的单词 在一起 那么（ st st ）
     * 前一个单词会把后一个单词的空格用掉
     * 所以 我们要把指指针回退一格
     */
    public static int count = 0;//单词个数统计
    public static int minIndex=0xfffffff-1;

    public static void indexOf(String str, int index, String aim) {
        int k = 0;//字母匹配
        int tamp=0;
        for (int i = index; i < str.length(); i++) {//从index 后开始判断
            if (str.charAt(i) == aim.charAt(k)) {//  前置短路当前文章字母和 单词字母相同
                k++;//相同 换到下对 字母
                if(k==aim.length()){//完全一致
                    if(tamp==0) {//只记录第一次的位置
                        minIndex=i-aim.length()+1;
                        tamp++; //再也不记录了
//                        return i-aim.length()+1;//返回单词第一个字母刚开始的索引
                    }// sd i s
                    count++;//单词计数
                    k=0;//从第一个字母开始
                    i--;//回退上一个字母 解决 相同单词在一起的 bug
                }
            }else{
                k=0;//从第一个字母开始
            }
        }
    }

    public static void funJava(String aim,String sour){
        int index=0;
        int count=0;
        while((index= sour.indexOf(aim,index))!=-1/*前面空格*/){//存在的一个单词 并且单词的后面是空格
            index--;
            index +=aim.length();//从上一个单词后面开始检索
            count++;
        }
        if(count==0){
            System.out.println("-1");//不存在
        }else{
            System.out.print(count+" ");//"单词出现的总个数："
            System.out.println(sour.indexOf(aim));//"第一次出现的位置："+
        }
    }

}
