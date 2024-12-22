package step6;

import java.util.Scanner;

public class Ba_3003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int []arr = {1,1,2,2,2,8};

        for(int i = 0; i < 6 ;i++){
            int n = sc.nextInt();
            if(n!=arr[i]) System.out.print((arr[i]-n)+" ");
            else System.out.print(0+" ");
        }



    }
}
