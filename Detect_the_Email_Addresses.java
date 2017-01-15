import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 29.12.2016.
 */
public class Detect_the_Email_Addresses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int N = Integer.parseInt(str);
        String[] s = new String[N];

        for( int i = 0 ; i < N ; i++){
            s[i]=input.nextLine();
        }
        String Regex_Pattern =  "([\\w\\d][\\w\\d\\.]*[\\w\\d]@[\\w\\d]+\\.(com|in|org|railnet\\.gov\\.in|gov\\.in|co.in|))";
        Pattern p = Pattern.compile(Regex_Pattern);

        int k=0;
        TreeSet<String> st = new TreeSet<>();
        for( int i = 0 ; i < N ; i++) {
            Matcher m = p.matcher(s[i]);
            while (m.find()) {
                st.add(m.group(1));
            }
        }

        for (String i : st){
            if(k != 0){
                System.out.print(";");
            }
            System.out.print(i);
            k=1;
        }

    }
}
