package step2;

import java.util.Arrays;
import java.util.Scanner;

public class Ba_2480 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int []arr = {a,b,c};
        if(a==b&b==c)
            System.out.println(10000+a*1000);
        else if(a==b||b==c)
            System.out.println(1000+b*100);
        else if(a==c)
            System.out.println(1000+c*100);
        else System.out.println(Arrays.stream(arr).max().getAsInt()*100);
    }
}
