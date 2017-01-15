import java.util.Scanner;

/**
 * Created by User on 15.01.2017.
 */
public class SOS {
    public static void main(String[] args) {
        SOS solution = new SOS();
        solution.solve();
    }
    private void solve () {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char [] arr = string.toCharArray();
        int numbers =0;
        for(int i=0;i<arr.length;i+=3){
            if(arr[i]!='S')
                numbers++;
            if(arr[i+1]!='O')
                numbers++;
            if(arr[i+2]!='S')
                numbers++;

        }
        System.out.println(numbers);

    }
}
