import java.util.HashSet;
import java.util.Scanner;


/**
 * Created by User on 15.01.2017.
 */
public class Pangrams {
    public static void main(String[] args) {
        Pangrams solution = new Pangrams();
        solution.solve();
    }
    private void solve () {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String str = string.toLowerCase().replace(" ","");
        char [] arr = str.toCharArray();
        HashSet set = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        if (set.size()==26)
            System.out.println("pangram");
        else
            System.out.println("not pangram");

    }
}
