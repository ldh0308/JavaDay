package Day03;

import java.util.Scanner;

public class SwitchBreak {
    public static void main(String[] args) {
        System.out.println("도시를 선택하세요 s, d, b, j = ");

        String ch = new Scanner(System.in).next(); //

        switch (ch) { // 조건 - 문자형, 정수형(long형 제외), 실수형 안됨
            case "s":
                System.out.print("서울 ");
            case "d":
                System.out.print("대구 ");
            case "b":
                System.out.print("부산 ");
            case "j":
                System.out.print("제주 ");
        } // switch end
        System.out.print("를(을) 선택하셨습니다.");
        }
}
