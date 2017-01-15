/**
 * Created by User on 26.12.2016.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Alien_Username {
    public static void main(String[] args) {
        /*Comment*/
        Scanner Input = new Scanner(System.in);
        String str = Input.nextLine();
        int N = Integer.parseInt(str);
        for (int i = 0; i<N; i++){
            String Test_String = Input.nextLine();
            String Regex_Pattern = "^[_\\.][0-9]+[a-zA-Z]*_?$";
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
