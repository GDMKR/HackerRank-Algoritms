import java.util.Scanner;

/**
 * Created by User on 25.12.2016.
 */
public class Super_Reduced_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        s1 = sc.nextLine();
        char[] symbols = new char[s1.length()];
        int i = 0;
        for (char letter : s1.toCharArray()) {
            symbols[i] = letter;
            i++;

        }
        for (i = 0 ; i < s1.length()-1; i++){
            if(symbols[i]!=symbols[i+1])
                System.out.print(symbols[i]);
            else{

                if (i +2 == s1.length()-1)
                    System.out.print(symbols[i + 2]);
                i+=1;

            }

        }

    }
}
