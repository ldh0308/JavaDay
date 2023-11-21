package Day03;

import java.util.Scanner;

public class IfControlExample {
    public static void main(String[] args) {
        System.out.println("integer data : ");
        int su = new Scanner(System.in).nextInt();

        // 짝/홀수 판정
        if( su % 2 == 0) {
            System.out.println( su + " ==> even");
        } else {
            System.out.println(su + " ==> odd");
        }
    }
}
