/**
 * Created by User on 26.12.2016.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Find_a_Word {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        String str = Input.nextLine();
        int N = Integer.parseInt(str);
        String[] arr  = new String[N];
        for (int i = 0; i<N; i++) {
            String Test = "*" + Input.nextLine() + "*";
            String Test_String = Test.replace("_", "");
            arr[i]=Test_String;
        }
            str = Input.nextLine();
            int k = Integer.parseInt(str);

            for(int j = 0; j < k; j++) {
                String Regex_Pattern = "(?<=[\\W])"+Input.nextLine()+"(?=[\\W])";
                Pattern p = Pattern.compile(Regex_Pattern);
                int Count = 0;
                for(int i=0;i<N;i++){
                    Matcher m = p.matcher(arr[i]);
                    while (m.find()) {
                        Count += 1;
                    }
                }
                System.out.println(Count);

            }



    }
}
