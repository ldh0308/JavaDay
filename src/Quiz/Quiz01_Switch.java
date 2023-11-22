package Quiz;

import java.util.Scanner;

// 3과목 입력 받고, 총점, 평균, 학점(if, switch) 구하기
public class Quiz01_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 객체 생성, 메모리에 할당, 생성자 함수 자동호출

        System.out.println("이름 : ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("국어, 영어, 전산 순으로 기재하세요");
        int kor = new Scanner(System.in).nextInt();
        int eng = new Scanner(System.in).nextInt();
        int com = new Scanner(System.in).nextInt();

        int total = kor + eng + com;
        double avg = total / 3.0;

        System.out.println(name + "님의 성적표 *****");
        System.out.println("국어 : " + kor + ", 영어 : " + eng + ", 전산 : " + com);
        System.out.printf("총점 : %d, 평균 : %.2f",total,avg);
        if (avg == 100) {
            System.out.println(", 학점 : A");
        } else if(avg >= 90) {
            System.out.println(", 학점 : B");
        } else if (avg >= 80) {
            System.out.println(", 학점 : C");
        } else if (avg >= 70) {
            System.out.println(", 학점 : D");
        } else if (avg >= 60) {
            System.out.println(", 학점 : E");
        } else {
            System.out.println(", 학점 : F");
        }
    }
}

/*
 name님의 성적표 *****
 국어 : 100, 영어 : 100, 전산 : 100
 총점 : 300, 평균 : 100.00, 학점 : A
 */
