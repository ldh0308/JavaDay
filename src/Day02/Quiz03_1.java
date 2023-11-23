package Day02;

import java.util.Scanner;

public class Quiz03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("국어 : ");
        int kor = sc.nextInt();
        System.out.println("영어 : ");
        int eng = sc.nextInt();
        System.out.println("전산 : ");
        int elt = sc.nextInt();

        int tot = kor + eng + elt;
        double avg = tot / 3.0f; //3f
        System.out.println(name + "님의 성적표 *****");
        System.out.println("국어 : " + kor + ", 영어 : " + eng + ", 전산 : " + elt);
        System.out.printf("총점 : %d 평균 : %.2f", tot, avg);
    }
}
