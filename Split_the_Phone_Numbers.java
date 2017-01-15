import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 28.12.2016.
 */
public class Split_the_Phone_Numbers {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        String str = Input.nextLine();
        int N = Integer.parseInt(str);
        String Regex_Pattern = "([0-9]|[0-9][0-9]|[0-9][0-9][0-9])[- ]([0-9]|[0-9][0-9]|[0-9][0-9][0-9])[- ]([0-9]{3,9}[0-9])";
        for (int i = 0; i<N; i++){
            String Test_String = Input.nextLine();
            Pattern p = Pattern.compile(Regex_Pattern);
            Matcher m= p.matcher(Test_String);
            while(m.find()) {
                System.out.println("CountryCode=" + m.group(1).trim() + ",LocalAreaCode=" + m.group(2).trim() + ",Number=" + m.group(3).trim());
            }

        }

    }
}
