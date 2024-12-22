package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ba_10988 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = str.length();
        int result = 1;
        for(int i = 0 ; i < n/2; i++){
            if(str.charAt(i)!=str.charAt(n-i-1)) {
                result = 0;
                break;
            }
        }
        System.out.println(result);


    }
}
