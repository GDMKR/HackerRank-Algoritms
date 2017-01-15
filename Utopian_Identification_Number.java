import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 28.12.2016.
 */
public class Utopian_Identification_Number {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        String str = Input.nextLine();
        int N = Integer.parseInt(str);
        for (int i = 0; i<N; i++){
            String Test_String = Input.nextLine();
            String Regex_Pattern = "^[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}$";
            Pattern p = Pattern.compile(Regex_Pattern);
            Matcher m = p.matcher(Test_String);
            int Count = 0;
            while(m.find()){
                Count += 1;
            }
            if (Count == 0)
                System.out.println("INVALID");
            else System.out.println("VALID");

        }

    }
}
