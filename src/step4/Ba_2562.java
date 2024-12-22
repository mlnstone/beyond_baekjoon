package step4;

import java.util.Scanner;

public class Ba_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max_num = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < 9 ; i ++){
            int n = sc.nextInt();

            if(max<n){
                max = n;
                max_num = i+1;
            }
        }
        System.out.println(max);
        System.out.println(max_num);
    }
}
