import java.util.Scanner;

/**
 * Created by User on 16.01.2017.
 */
public class SherlockAndSquares {
    private void solve (){
        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();
        for (int q = 0 ; q < queries;q++) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            System.out.println((long) (Math.floor(Math.sqrt(B)) - Math.ceil(Math.sqrt(A)) + 1));
        }
    }
    public static void main(String[] args) {
        SherlockAndSquares solution = new SherlockAndSquares();
        solution.solve();
    }
}
