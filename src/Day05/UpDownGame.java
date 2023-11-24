package Day05;

import java.util.Random;
import java.util.Scanner;

// 업/다운 게임 프로그램 작성(난수 이용)
// 1~100 숫자 중에서 임의의 난수 추출해 놓고, 사용자는 5번의 기회를 줘서 입력 받는다.(scanner)
// 그 입력 받은 숫자와 추출한 난수가 같은 지를 판정하는 프로그램 작성
public class UpDownGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int num;  int sel;
        num = rand.nextInt(100) + 1;
//        System.out.println(num);

        System.out.println("5번의 기회");
        for (int i = 0; i < 5; i++) {
            sel = sc.nextInt();
            if(sel == num) {
                System.out.println("정답입니다."); break;
            } else if (sel < num) {
                System.out.println("업"); continue;
            } else if (sel > num) {
                System.out.println("다운"); continue;
            }
        }
        System.out.println("정답 = " + num);

    }
}
