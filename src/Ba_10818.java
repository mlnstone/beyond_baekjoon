import java.util.Arrays;
import java.util.Scanner;

public class Ba_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0 ; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print(Arrays.stream(arr).min().getAsInt()+" ");
        System.out.print(Arrays.stream(arr).max().getAsInt());
    }
}
