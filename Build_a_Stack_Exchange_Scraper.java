import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 28.12.2016.
 */
public class Build_a_Stack_Exchange_Scraper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = new String();
        //while (input.hasNextLine()){
        for( int i = 0 ; i < 100; i++){
            s+=input.nextLine();
        }
        String Regex_Pattern =  "<h3>\\[([\\w\\s]*)\\]\\(/questions/([\\d]*)/[\\W\\w\\S\\s]*</h3>[\\w\\W\\s\\S\\d\\D]*relativetime\">([\\d\\w\\s]*)<";
        //[\w\W\s\S\d\D]*>([\w\d]*)<
        //asked <span title="2013-08-27 21:49:14Z" class="relativetime">11 hours ago</span>
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(s);

        while (m.find()) {
            System.out.println(m.group(2).trim() +";"+ m.group(1).trim()+";"+m.group(3));
        }

//[.]*asked[.]*>([\d\w]*)<

    }
}
