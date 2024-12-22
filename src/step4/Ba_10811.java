package step4;

import java.util.Scanner;

public class Ba_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }
        for(int i = 0; i < m; i++){
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            for(int j = 0; j<=(b-a)/2; j++){

                        int tmp = arr[a+j];
                        arr[a+j]=arr[b-j];
                        arr[b-j]=tmp;

                }


            }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}

