package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ba_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i ++){

            String []str = br.readLine().split(" ");

            for(int j = 0 ; j < str[1].length(); j++){
                for(int k = 0 ; k < Integer.parseInt(str[0]) ; k++){
                    System.out.print(str[1].charAt(j));
                }
            }
            System.out.println();

        }



    }
}
