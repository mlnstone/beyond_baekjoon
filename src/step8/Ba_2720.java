package step8;

import java.util.Scanner;

public class Ba_2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            int[] item = {0, 0, 0, 0}; // 0.25 0.10 0.05 0.01
            int money = sc.nextInt();

            while(money >= 25) {
                item[0]++;
                money -= 25;
            }
            while(money >= 10) {
                item[1]++;
                money -= 10;
            }

            while(money >= 5) {
                item[2]++;
                money -= 5;
            }

            while(money >= 1) {
                item[3]++;
                money -= 1;
            }
            for (int i1 : item) {
                System.out.print(i1+" ");
            }
            System.out.println();




        }


    }
}
