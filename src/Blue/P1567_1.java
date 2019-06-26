import java.util.Scanner;

public class P1567_1 {
    private static Scanner cin;
    public static void main(String args[]) throws Exception {
        cin = new Scanner(System.in);
        int n = cin.nextInt();
        if(n<=0 || n>Math.pow(10, 7)) {
            return;
        }
        int historyRecord = 0;
        int newRecord = 0;
        int startTemprature = -1;
        int MAX = (int) Math.pow(10, 9);
        for (int i = 0; i < n; i++) {
            int t = cin.nextInt();
            if(t>=0&&t<=MAX) {
                if(t > startTemprature) {
                    newRecord++;
                    startTemprature = t;
                }else {
                    if(newRecord > historyRecord) {
                        historyRecord = newRecord;
                    }
                    newRecord = 1;
                    startTemprature = t;
                }
            }
        }
        if(newRecord > historyRecord) {
            historyRecord = newRecord;
        }
        System.out.println(historyRecord);
    }
}