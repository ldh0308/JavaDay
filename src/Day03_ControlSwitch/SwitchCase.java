package Day03_ControlSwitch;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("당신의 포인트 점수는? (1~3점) input : ");

        int point = new Scanner(System.in).nextInt();

        switch (point) {
            case 1 : // 숫자, '문자', "문자열"
                System.out.println("포인트 점수는 1점입니다.");
                break;
            case 2 :
                System.out.println("포인트 점수는 2점입니다.");
                break;
            case 3 :
                System.out.println("포인트 점수는 3점입니다.");
                break;
            default:
                System.out.println(" 없는 점수 입니다. 1~3까지만 기재해주세요 ");
        } // switch case는 반드시 코드블록 필요
    }
}
