package CometOj;

public class Test {
    public static void main(String[] args) {
        int n=45;
        String ns=n+"";
        char[] nss;
        nss=ns.toCharArray();
        int tamp=0;
        for (char i:nss) {
            tamp+=i-'0';
        }
        System.out.println(tamp);
    }
}
