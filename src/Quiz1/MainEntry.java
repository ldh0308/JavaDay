package Quiz1;

import java.util.Scanner;

public class MainEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Score score = new Score();

        System.out.println("이름을 입력하세요");
        score.setName(sc.next());
        System.out.println("국어점수를 입력하세요");
        score.setKor(sc.nextInt());
        System.out.println("영어점수를 입력하세요");
        score.setEng(sc.nextInt());
        System.out.println("전산점수를 입력하세요");
        score.setCom(sc.nextInt());

        score.setTotal(score.getTotal());
        score.setAvg(score.getAvg());
        score.setGrade(score.getGrade());

        score.disp();
    }
}
