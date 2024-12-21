package step2;

import java.util.Scanner;

public class Ba_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = c / 60;
        int e = c % 60;;
        int time = a+d;
        int min = b+e;
        if(min>=60 && time>23){
            System.out.println((time-23)+" "+(min-60));

        }
        else if(min>=60) {
            if(a+d+1>23) System.out.println((time+1-24)+" "+(min-60));
            else System.out.println((time + 1) + " " + ( min - 60));
        }
        else if(time>23){
            System.out.println((time-24)+" "+(min));
        }

        else System.out.println((time)+" "+(min));

    }
}
