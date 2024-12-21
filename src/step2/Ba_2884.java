package step2;

import java.util.Scanner;

public class Ba_2884 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(b-45 < 0 && a-1 < 0)
            System.out.println((a+23)+" "+(b+15));
        else if(b-45<0)
            System.out.println((a-1)+" "+(b+15));
        else System.out.println(a+" "+(b-45));

    }
}
