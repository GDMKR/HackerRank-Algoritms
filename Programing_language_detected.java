/**
 * Created by User on 28.12.2016.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class Programing_language_detected {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String Regex_Pattern1 = "( )*#include( )*<( )*stdio.h( )*>";
        Pattern p1 = Pattern.compile(Regex_Pattern1);
        String Regex_Pattern2 = "[.]*;$";
        Pattern p2 = Pattern.compile(Regex_Pattern2);
        List<String> arr = new ArrayList<>();
        while(scan.hasNextLine()){
            arr.add(scan.nextLine());
        }
        int flag = 0;
        for (String i : arr) {
            Matcher m = p1.matcher(i);
            if (m.find()) {
                System.out.println("C");
                flag = 1;
                break;
            }

        }
        int flag2 = 0;
        if(flag == 0){
            for (String i : arr) {
                Matcher m = p2.matcher(i);
                if (m.find()) {
                    System.out.println("Java");
                    flag2 = 1;
                    break;
                }
            }
        }
        if(flag2==0 && flag==0){
            System.out.println("Python");
        }

    }
}
