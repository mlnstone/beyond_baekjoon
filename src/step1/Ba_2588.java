package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ba_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String []b = br.readLine().split("");
        int c = a * Integer.parseInt(b[2]);
        int d = a * Integer.parseInt(b[1]);
        int e = a * Integer.parseInt(b[0]);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(e*100+d*10+c);

    }
}
