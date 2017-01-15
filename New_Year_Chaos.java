import java.util.Scanner;

/**
 * Created by User on 24.12.2016.
 */

public class New_Year_Chaos {
    public static void Move(int [] arr){
        int s=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] - (i + 1) > 2) {
                System.out.println( "Too chaotic");
                return;
            }
            for (int j = Math.max(0, arr[i] - 2); j < i; j++)
                if (arr[j] > arr[i]) s++;
        }
        System.out.println(s);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int number_of_repetitions =sc.nextInt();
        while(number_of_repetitions!=0) {
            int k = sc.nextInt();
            int[] arr = new int [k];
            for(int j = 0 ; j < k; j++)
                arr[j] = sc.nextInt();
            Move(arr);

            number_of_repetitions --;
        }





    }
}
