import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by User on 15.01.2017.
 */
public class Cipher {
    public static void main(String[] args) {
        Cipher solution = new Cipher();
        solution.solve();
    }
    private void solve () {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = scanner.nextLine();
        int k = scanner.nextInt();
        char [] arr = string.toCharArray();
        k=(k%26);
        for(int i=0;i<arr.length;i++){
            if(Character.isAlphabetic(arr[i])){
                if(Character.isUpperCase(arr[i])){
                    arr[i]+=k;
                    if(arr[i]>90)arr[i]-=26;
                }
                else{
                    arr[i]=(char)(k+arr[i]);
                    if(arr[i]>122){
                        arr[i]-=26;
                    }
                }
            }

        }
        for( int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
