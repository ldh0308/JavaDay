package Day03_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionFinallyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("정수 두개 입력해주세요");
            System.out.println("integer 1 > ");
            int Num1 = sc.nextInt();
            System.out.println("integer 2 > ");
            int Num2 = sc.nextInt();
            System.out.println("Num1 / Num2 = " + (Num1 / Num2));
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException ");
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (Exception e) {
            System.out.println("Exception ");
            System.out.println("0으로 나눌 수 없습니다."); // 상위가 되는 예외는 하단으로 가야한다.
        } finally {
            System.out.println("finally 무조건 처리됨!!!");
        }
    }
}
