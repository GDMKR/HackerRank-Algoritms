import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 29.12.2016.
 */
public class Building_a_Smart_IDE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern multipleLineComment = Pattern.compile("((?s)/\\*.*?\\*/|(?-s)//.*)");
        StringBuilder input = new StringBuilder();
        while (sc.hasNextLine()){
            input.append(sc.nextLine().trim());
            input.append("\n");
        }
        Matcher m1 = multipleLineComment.matcher(input.toString());
        while (m1.find())
            System.out.println(m1.group(1));
    }
}
