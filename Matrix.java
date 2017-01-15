import a.h.M;

import java.util.Scanner;

/**
 * Created by User on 15.01.2017.
 */
public class Matrix {
    private int n ;
    private int m ;
    private long arr[][];
    Matrix(int n,int m){
        this.n=n;
        this.m=m;
        arr = new long[n][m];
    }
    Matrix (int n, int m, Scanner sc){
        this.n=n;
        this.m=m;
        arr = new long[n][m];
        for (int i = 0 ; i < n ; i++)
            for (int j = 0 ; j < m ; j++)
                arr[i][j] = sc.nextInt();

    }
    private void rotate (long r) {
        int k=Math.min(n,m);
        long [] perimeter = new long[(n*2+(m-2)*2)];

        for (int i=0; i<k; i++) {

            if ((i+1)*2 > k) break;

            int ptr=0;

            //fill an array of perimeter of a circle
                //top horizontal line
                for (int j=i; j<m-i; j++) {
                    perimeter[ptr++] = arr[i][j];
                }

                // right vertical line
                for (int j=i+1; j<n-i; j++) {
                    perimeter[ptr++] = arr[j][m-1-i];
                }

                // bottom horizontal line
                for (int j=m-2-i; j>=i; j--) {
                    perimeter[ptr++] = arr[n-1-i][j];
                }

                // left vertical line
                for (int j=n-2-i; j>i; j--) {
                    perimeter[ptr++] = arr[j][i];
                }


            //Fill with shift
            int new_start_pos = (int)r%ptr;

            if (new_start_pos>0) {
                //top row, left to right
                for (int j=i; j<m-i; j++) {
                    arr[i][j] = perimeter[new_start_pos];
                    new_start_pos = (new_start_pos+1) % ptr;
                }

                // right column, top to bottom
                for (int j=i+1; j<n-i; j++) {
                    arr[j][m-1-i] = perimeter[new_start_pos];
                    new_start_pos = (new_start_pos+1) % ptr;
                }

                // bottom row, right to left
                for (int j=m-2-i; j>=i; j--) {
                    arr[n-1-i][j] = perimeter[new_start_pos];
                    new_start_pos = (new_start_pos+1) % ptr;
                }

                // left column, bottom to top
                for (int j=n-2-i; j>i; j--) {
                    arr[j][i] = perimeter[new_start_pos];
                    new_start_pos = (new_start_pos+1) % ptr;
                }
            }



        }


    }
    private void show(){
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();
        Matrix A = new Matrix(n, m, sc);
        A.rotate(r);
        A.show();
    }
}
