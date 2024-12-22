package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ba_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int []arr = new int[26];
        Arrays.fill(arr,-1);
        for(int i = 0 ; i<str.length();i++){

            if(arr[str.charAt(i)-'a'] == -1) {
                arr[str.charAt(i)-'a'] = i;
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }



    }
}
