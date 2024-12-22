package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Ba_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();

        double sum = Arrays.stream(arr).sum();
        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println((sum/max)*100/n);
    }
}
