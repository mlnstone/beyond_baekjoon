import java.util.Scanner;

public class Ba_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0 ; i < n; i++)
            arr[i] = i+1;
        for(int i = 0 ; i < m; i++){
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int tmp = arr[b];
            arr[b] = arr[a];
            arr[a] = tmp;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
