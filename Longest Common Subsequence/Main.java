
/**
 *
 * @author Chamal Lakshika Perera
 * @license published under public domain
 */
public class Main {

    public static void main(String[] args) {
        String y = "ABCBDAB";
        String x = "BDCABA";
        LCS lcs = new LCS();
        int c[][] = lcs.initLCS(x, y);
        System.out.println(lcs.backtrack(c, x, y, x.length(), y.length()));
    }
}
