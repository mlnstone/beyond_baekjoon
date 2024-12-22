package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ba_2908 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String []str = br.readLine().split(" ");

        char []c1 = str[0].toCharArray();
        char []c2 = str[1].toCharArray();

        for(int i = 2 ; i >= 0 ;i--){
            c1[i] = str[0].charAt(2-i);
            c2[i] = str[1].charAt(2-i);
        }
        String str1 = new String(c1);
        String str2 = new String(c2);
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);

        System.out.println(Math.max(a, b));






    }
}
