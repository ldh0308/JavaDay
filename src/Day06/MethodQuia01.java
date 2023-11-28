package Day06;

import java.util.Scanner;

// 사칙연산(+,)
public class MethodQuia01 {
    // 사칙연산(+,-,&,/) 함수 -2개 리턴타입 매개변수 있는 함수
    // plus(+), sub(-), mul(*), div(/) <<예외처리
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        while (true) {
            System.out.println("integer data input(1,2,3,4,0) = ");
            int choice = sc.nextInt();

            switch (choice) { // 무한 루프일 때는 탈출 구문이 있어야 함.
                case 1:
                    System.out.println("덧셈");
                    result = plus(sc.nextInt(), sc.nextInt(), sc.nextInt());
                    System.out.println("plus = " + result);
                    break;
                case 2:
                    System.out.println("뺄셈");
                    result = sub(sc.nextInt(), sc.nextInt());
                    System.out.println("sub = " + result);
                    break;
                case 3:
                    System.out.println("나눗셈");
                    result = div(sc.nextInt(), sc.nextInt());
                    System.out.println("div = " + result);
                    break;
                case 4:
                    System.out.println("곱셈");
                    result = mul(sc.nextInt(), sc.nextInt());
                    System.out.println("mul = " + result);
                    break;
                case 0:
                    System.out.println("프로그램 종료합니다.");
                    System.exit(0);

                default:
                    System.out.println("없는 선택 번호이거나 문자입니다. 숫자(1,2,3,4,0) 이 중에서 넣어주세요!!");
                    break;
            }
        }
    }

    public static int plus(int x, int y, int z) {
        int hap = x + y + z;
        return hap;
    }

    public static int sub(int x, int y) {
        int sub = x - y;
        return sub;
    }

    public static int div(int x, int y) {
        int div = x / y;
        return div;
    }

    public static int mul(int x, int y) {
        int mul = x * y;
        return mul;

    }
}
