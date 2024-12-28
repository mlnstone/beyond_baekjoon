import java.util.Scanner;

public class Ba_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {


        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            if (arr[i] < 2) continue;
            else if (arr[i] == 2 || arr[i] == 3) count++;
            else {
                for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                    if (arr[i] % j == 0) {
                        sum = 0;
                        break;
                    } else sum++;
                }
                if (sum > 0)
                    count++;

            }
        }

        return count;
    }

}
