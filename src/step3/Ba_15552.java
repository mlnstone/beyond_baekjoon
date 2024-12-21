package step3;

import java.io.*;

public class Ba_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n; i++){
            String []str = br.readLine().split(" ");
            int sum = Integer.parseInt(str[0])+Integer.parseInt(str[1]);
            bw.write( sum +"\n");

        }
        bw.flush();
    }
}
