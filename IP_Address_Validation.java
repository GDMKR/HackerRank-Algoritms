/**
 * Created by User on 26.12.2016.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IP_Address_Validation {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        String str = Input.nextLine();
        int N = Integer.parseInt(str);
        for (int i = 0; i<N; i++){
            String Test_String = Input.nextLine();
            String Regex_Pattern1 = "^([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                    "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]" +
                    "|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$";
            String Regex_Pattern2 = "^([0-9a-fA-F]{1,4})[:]([0-9a-fA-F]{1,4})[:]([0-9a-fA-F]{1,4})[:]" +
                    "([0-9a-fA-F]{1,4})[:]([0-9a-fA-F]{1,4})[:]([0-9a-fA-F]{1,4})[:]([0-9a-fA-F]{1,4})[:]" +
                    "([0-9a-fA-F]{1,4})$";
            Pattern p1 = Pattern.compile(Regex_Pattern1);
            Pattern p2 = Pattern.compile(Regex_Pattern2);
            Matcher m1= p1.matcher(Test_String);
            Matcher m2= p2.matcher(Test_String);

            if(m1.matches())
                System.out.println("IPv4");
            else if( m2.matches())
                System.out.println("IPv6");
            else
                System.out.println("Neither");

        }

    }
}
