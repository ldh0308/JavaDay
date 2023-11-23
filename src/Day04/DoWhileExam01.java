package Day04;

import java.util.Scanner;

public class DoWhileExam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int su;

        while (true) { // 무한루프
            do {
                System.out.println("점수를 입력하세요(0~100) = ");
                su = sc.nextInt();
                System.out.println(su);
            } while (su < 0 && su > 100);

            System.out.println("점수 더 입력 받으시겠습니다(y/n)? ");
            char yesno = sc.next().charAt(0);
            if (yesno == 'n' || yesno == 'N') break; //탈출구문
        }
    }
}
