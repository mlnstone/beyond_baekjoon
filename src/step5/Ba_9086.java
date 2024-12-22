package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ba_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n; i++){
            String []str = br.readLine().split("");
            int k = str.length;
            System.out.println(str[0]+str[k-1]);
        }
    }
}
