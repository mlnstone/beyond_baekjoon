package step8;

import java.util.Scanner;

public class Ba_1193 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1/1 - 1/2 - 2/1 - 3/1 - 2/2 - 1/3 - 1/4

        int k = 1;
        int before = 0;
        while ((k * (k + 1) / 2) < n) {
            before = k * (k + 1) / 2;
            k++;
        }

        if (k % 2 == 0)
            System.out.println((n - before) + "/" + ((k + 1) - (n - before)));
        else {
            System.out.println(((k + 1) - (n - before)) + "/" + (n - before));
        }
    }
}
