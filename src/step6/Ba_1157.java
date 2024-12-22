package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ba_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();


        int []arr = new int[26];
        for(int i = 0 ; i < str.length(); i++){
            arr[str.charAt(i)-'A']++;
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int alpha = 0;
        int count = 0;
        for (int i = 0 ; i < 26; i++) {
            if(arr[i]==max){
                alpha = i+'A';
                count++;
            }
        }
        if(count > 1)
            System.out.println("?");
        else System.out.println((char)alpha);







    }
}
