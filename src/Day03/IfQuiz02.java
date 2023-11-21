package Day03;

import java.util.Scanner;

public class IfQuiz02 {
    public static void main(String[] args) {
        //숫자 2개 입력 받아서 큰 수 출력하는 프로그램 생성
        System.out.println("integer data : ");
        int Num = new Scanner(System.in).nextInt();
        System.out.println("integer data2 : ");
        int Num2 = new Scanner(System.in).nextInt();

        if(Num > Num2) {
            System.out.println(Num + " data1 더 큽니다.");
        }else if(Num < Num2) {
            System.out.println(Num2 + " data2 더 큽니다.");
        }else {
            System.out.println("값이 같습니다." + Num);
        }
    }
}