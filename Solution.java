import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int number_of_repetitions =sc.nextInt();
        while(number_of_repetitions!=0){
            int N = sc.nextInt();
            int[][] matrix = new int[2*N][2*N];
            int s = 0;
            for(int i = 0; i< 2*N; i++)
                for(int j = 0 ; j < 2*N; j++)
                    matrix[i][j]=sc.nextInt();

            for(int i = 0; i< N; i++)
                for(int j = 0 ; j < N; j++)
                    s+=Math.max(Math.max(matrix[i][j], matrix[i][2*N-1-j]),Math.max( matrix[2*N-1-i][j], matrix[2*N-1-i][2*N-j-1]));
            System.out.print(s);
            number_of_repetitions --;
        }


    }

}
