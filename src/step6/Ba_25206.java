package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ba_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double result = 0;

        double total_grade = 0.0;
        for(int i= 0; i<20; i++){
            String []str = br.readLine().split(" ");

            double score = Double.parseDouble(str[1]); // 가운데 수
            double grade = 0.0; // 맨 오른쪽 수


            if(str[2].equals("A+"))
                grade = 4.5;
            else if(str[2].equals("A0"))
                grade = 4.0;
            else if(str[2].equals("B+"))
                grade = 3.5;
            else if(str[2].equals("B0"))
                grade = 3.0;
            else if(str[2].equals("C+"))
                grade = 2.5;
            else if(str[2].equals("C0"))
                grade = 2.0;
            else if(str[2].equals("D+"))
                grade = 1.5;
            else if(str[2].equals("D0"))
                grade = 1.0;
            else if(str[2].equals("F"))
                grade = 0.0;
            else if(str[2].equals("P"))
                continue;
            total_grade = total_grade + score;

            result = result + (grade * score);


        }
        System.out.println(result/total_grade);



    }
}
