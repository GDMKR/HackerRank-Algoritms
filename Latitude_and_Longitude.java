/**
 * Created by User on 26.12.2016.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Latitude_and_Longitude {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        String str = Input.nextLine();
        int N = Integer.parseInt(str);
        for (int i = 0; i<N; i++){
            String Test_String = Input.nextLine();
            String Regex_Pattern = "^\\([+-]?([0-9]|[0-9]\\.[0-9]+|[1-8][0-9]|90|[1-8][0-9]\\.[0-9]+|90\\.[0]+)," +
                    " [+-]?([0-9]|[1-9][0-9]|1[0-7][0-9]|180|[0-9]\\.[0-9]+|[1-9][0-9]\\.[0-9]+|1[0-7][0-9]\\.[0-9]+|180\\.[0]+)\\)$";
            Pattern p = Pattern.compile(Regex_Pattern);
            Matcher m = p.matcher(Test_String);
            int Count = 0;
            while(m.find()){
                Count += 1;
            }
            if (Count == 0)
                System.out.println("Invalid");
            else System.out.println("Valid");

        }

    }
}
