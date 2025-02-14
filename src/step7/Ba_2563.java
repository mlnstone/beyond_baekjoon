package step7;

import java.util.Scanner;

public class Ba_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int[][] area = new int[100][100];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {

                    area[x + j][y + k] = 1;

                }

            }

        }
        int count = 0;
        for (int[] ints : area) {
            for (int anInt : ints) {
                if (anInt == 1)
                    count++;
            }

        }
        System.out.println(count);


    }
}
