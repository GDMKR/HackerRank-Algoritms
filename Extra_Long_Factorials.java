import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by User on 26.12.2016.
 */
public class Extra_Long_Factorials {

    static BigInteger FactNaive(int n)
    {
        BigInteger r = new BigInteger("1");
        for (int i = 2; i <= n; ++i)
           r = r.multiply(BigInteger.valueOf(i));
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print(FactNaive(number));

    }
}
