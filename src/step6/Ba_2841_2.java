package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ba_2841_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] alphabets = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        for (String s : alphabets) {
            str = str.replace(s," ");
        }
        System.out.println(str.length());

    }
}
