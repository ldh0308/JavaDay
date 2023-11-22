package Day03;

import java.util.Scanner;

// 년도 입력 받아서 윤/평년 프로그램 작성
public class IfQuiz03 {
    public static void main(String[] args) {
        System.out.println("년도를 입력하세요 : ");
        int Year = new Scanner(System.in).nextInt();

        if ( Year % 4 == 0) {
            if ((Year % 100 != 0) || (Year % 400 == 0)) {
                System.out.println("윤년");
            } else {
                System.out.println("평년");
            }
        } else {
            System.out.println("평년");         }
    }
}
