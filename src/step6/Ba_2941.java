package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ba_2941 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;
        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'c'){
                if(str.charAt(i+1)=='=')
                    i++;
                else if(str.charAt(i+1)=='-')
                    i++;

            }
            else if(ch == 'd'){
                if(str.charAt(i+1)=='z'){
                    if(str.charAt(i+2)=='=')
                        i = i+2;


                }
                else if(str.charAt(i+1)=='-')
                    i++;


            }
            else if(ch =='l') {
                if (str.charAt(i + 1) == 'j')
                    i++;

            }
            else if(ch =='n') {
                if (str.charAt(i + 1) == 'j')
                    i++;

            }
            else if(ch =='s') {
                if (str.charAt(i + 1) == '=')
                    i++;

            }
            else if(ch =='z') {
                if (str.charAt(i + 1) == '=')
                    i++;

            }
            count++;

        }
        System.out.println(count);



    }
}
