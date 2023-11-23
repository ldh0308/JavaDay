package Day03;

import java.util.Scanner;

// 숫자 입력 받아서 짝/홀수 판정 프로그램
public class Quiz01 {
    public static void main(String[] args) {
        System.out.println("integer data : ");
        int su = new Scanner(System.in).nextInt();

        // 짝/홀수 판정
        switch ( su % 2 ) {
            case 0 : // case 뒤에는 결과 값을 의미
            System.out.println("짝수");
            break;
            case 1 :
            System.out.println("홀수");
            break;
            default:
                System.out.println("숫자오류");
        }
    }
}
