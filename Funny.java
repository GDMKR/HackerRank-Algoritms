import java.util.Scanner;

/**
 * Created by User on 15.01.2017.
 */
public class Funny {
    public static void main(String[] args) {
        Funny solution = new Funny();
        solution.solve();
    }

    private void solve() {
        Scanner scanner = new Scanner(System.in);
        int queries = Integer.parseInt(scanner.nextLine());
        for (int q = 0; q < queries ; q++) {
            String S = scanner.nextLine();
            char[] s = S.toCharArray();
            String R = new StringBuilder(S).reverse().toString();
            char[] r = R.toCharArray();
            int flag = 0;
            for (int i = 1; i < s.length; i ++) {
                if (Math.abs(s[i] - s[i - 1]) != Math.abs(r[i] - r[i - 1])) {
                    System.out.println("Not Funny");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println("Funny");
        }
    }
}
