package step3;

import java.util.Scanner;

public class Ba_11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            System.out.println("Case #"+i+": "+(sc.nextInt()+sc.nextInt()));
        }
    }
}
