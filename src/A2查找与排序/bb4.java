package A2查找与排序;

public class bb4 {//排序后有一个空串 查找指定字符串的索引

    public static void main(String[] args) {
        String[] arr = {"a", "", "ac", "ad", "b", "", "ba"};
        int res = indexOf(arr, "abc");
        System.out.print(res);
    }

    static int indexOf(String[] arr, String p) {
        int begin = 0;
        int end = arr.length - 1;
        while (begin <= end) {
            int indeOfmid = begin + (end - begin) / 2;
            while (arr[indeOfmid].equals("")) {//while 空串子
                indeOfmid++;
                if(indeOfmid>end)//bug
                    return -1;
            }
            if (arr[indeOfmid].compareTo(p) > 0) {//左边
                end = indeOfmid - 1;
            } else if (arr[indeOfmid].compareTo(p) < 0)//左边
                begin = indeOfmid + 1;
            else
                return indeOfmid;
        }
        return -1;
    }

}
