package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Ba_3052 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int []arr = new int[11];

        for(int i = 0 ; i<arr.length-1; i++){

            arr[i] = sc.nextInt()%42;
        }
        Arrays.sort(arr);
        if(Arrays.stream(arr).max().getAsInt()==0)
            System.out.println(1);
        // 나머지가 모두 0인 경우 1 출력
        else if(arr[1]!=0) {
            int count = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] != arr[i + 1])
                    count++;
            }
            System.out.println(count);
        }
        else {
            int count = 1;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] != arr[i + 1])
                    count++;
            }
            System.out.println(count);
        }

    }
}
