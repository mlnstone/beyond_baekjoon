import java.util.ArrayList;
import java.util.Scanner;

public class Ba_2581 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        solution(m, n);
    }

    public static void solution(int m, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        if (n < 2) {
            System.out.println(-1);
        } else {
            {
                for (int i = m; i <= n; i++) {
                    boolean b = true;
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            b = false;
                            break;
                        }
                    }
                    if (b) { //소수면
                        list.add(i);
                    }
                }

            }
            for (Integer integer : list) sum += integer;
            if (list.isEmpty()) System.out.println(-1);
            else {
                if (list.get(0) == 1) {
                    System.out.println(sum - 1);
                    System.out.print(list.get(1));
                } else {
                    System.out.println(sum);
                    System.out.print(list.get(0));
                }
            }

        }


    }
}
