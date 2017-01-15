import java.util.Scanner;

/**
 * Created by User on 25.12.2016.
 */
public class Sherlock_and_Watson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int[] arr= new int[N];
        for(int i = 0;i<N;i++)
            arr[i]=sc.nextInt();

        for( int i = 0 ; i < Q; i++){
            int w=sc.nextInt()-K;
            if (w<0) w+=N;
            System.out.println(arr[w]);

        }
    }
}