import java.util.ArrayList;
import java.util.Scanner;

public class Ba_2501 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(solution(N, K));
    }
    public static int solution(int N, int K){


        ArrayList<Integer> list = new ArrayList<>();


        for(int i = 1; i <= N; i++){
            if(N%i==0)
                list.add(i);
        }
        if(list.size() < K) return 0;
        else return(list.get(K-1));



    }
}
