package step7;

import java.util.Scanner;

public class Ba_2566 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [][]arr = new int[10][10];

        int max = Integer.MIN_VALUE;
        int max_x = Integer.MIN_VALUE;
        int max_y = Integer.MIN_VALUE;

        for(int i = 1 ; i < 10; i++){
            for(int j = 1 ; j < 10 ; j++){
                arr[i][j] = sc.nextInt();
                if(max < arr[i][j]){
                    max = arr[i][j];
                    max_x = i;
                    max_y = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(max_x+" "+max_y);



    }
}
