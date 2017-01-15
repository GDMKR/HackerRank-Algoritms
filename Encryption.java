import java.util.Scanner;

/**
 * Created by User on 26.12.2016.
 */
public class Encryption {
    public static void main(String[] args) {
        //Create scanner
        Scanner sc = new Scanner(System.in);
        String str = new String(sc.next());
        //Compute the numbers of rows and columns
        double r = Math.floor(Math.sqrt(str.length()));
        double c = Math.ceil(Math.sqrt(str.length()));
        if(r*c<str.length())
            r++;

        //Create str array
        String[] arr_str = str.split("");
        // Print the string in desired order
        for(int i=0; i<c; i++){
            int k = i;
            for(int j=0; j<r ;j++){
                if(k < str.length())
                    System.out.print(arr_str[k]);
                k+=c;
            }
            System.out.print(" ");
        }

    }
}
