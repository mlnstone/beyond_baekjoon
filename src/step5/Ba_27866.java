package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ba_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []str = br.readLine().split("");
        System.out.println(str[Integer.parseInt(br.readLine())-1]);
    }
}
