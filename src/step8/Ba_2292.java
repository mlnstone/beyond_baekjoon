package step8;

import java.util.Scanner;

public class Ba_2292 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1 1
        // 2~7 2 6개  / 1
        // 8~19 3 12개   / 2,3
        // 20~37 4 18개  / 4,5,6
        // 6 * n / 6
        int count = 1;
        int range = 2;
        if(n != 1)
            while(range <= n){
                range = range + 6 * count;
                count++;
            }
        System.out.println(count);


    }
}
