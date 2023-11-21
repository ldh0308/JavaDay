package Ex03; // 사용자 package 가 우선순위

import java.util.Scanner; // 사용할 패키지 임포트 하기  //java.lang package 자동 임포트 됌

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int su = sc.nextInt();

        System.out.println("integer data input : ");
        System.out.println("name input : ");

        String name = sc. next();
        System.out.println(su + ", name : " + name);
    }
}
