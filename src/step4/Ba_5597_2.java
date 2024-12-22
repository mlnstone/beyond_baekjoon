package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ba_5597_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int []arr = new int[31];
        // 비교하기위해..

        for(int i = 1; i<=28; i++){
            int num = Integer.parseInt(br.readLine());
            arr[num] = 1;
        }
        for(int i = 1 ; i<=30; i++)
            if(arr[i]==0)
                System.out.println(i);

    }
}
