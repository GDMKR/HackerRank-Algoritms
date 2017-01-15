import java.util.Scanner;

/**
 * Created by User on 15.01.2017.
 */
public class CamelCase {

    public static void main(String[] args) {
        CamelCase solution = new CamelCase();
        solution.solve();
    }
    private void solve (){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        char [] letters = string.toCharArray();
        int ans = 1;
        //checking UpperCase
        for (int i = 1; i < letters.length;i++)
            if (Character.isUpperCase(letters[i])){
                ans++;
            }
        System.out.println(ans);

    }
}
