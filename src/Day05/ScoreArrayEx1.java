package Day05;

import java.util.Scanner;

public class ScoreArrayEx1 {
//    7명의 3과목 입력 받고, 총점, 평균, 학점 구하기 - 배열이용하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Inwon = 2;
        int[] kor = new int[Inwon];
        int[] eng = new int[Inwon];
        int[] com = new int[Inwon];
        int[] tot = new int[Inwon];
        double[] avg = new double[Inwon];
        String[] name = new String[Inwon];
        char[] grade = new char[Inwon];
        double avgAll = 0.0;
        int totalAll = 0;

        for (int i = 0; i < Inwon; i++) {
            System.out.println("이름 = ");
            name[i] = sc.next();
            System.out.print(name[i] + "님의 국어 점수를 입력하세요(0~100) = ");
            kor[i] = sc.nextInt();
            System.out.print(name[i] + "님의 영어 점수를 입력하세요(0~100) = ");
            eng[i] = sc.nextInt();
            System.out.print(name[i] + "님의 전산 점수를 입력하세요(0~100) = ");
            com[i] = sc.nextInt();
        }

        for (int i = 0; i < Inwon; i++) {
            tot[i] = kor[i] + eng[i] + com[i];
            avg[i] = tot[i] / 3.0;

            totalAll += tot[i];
            avgAll = (double) totalAll / Inwon;

            switch ((int) avg[i] / 10) {    //switch ( total / 30 ) {
                case 10:
                case 9:
                    grade[i] = 'A';
                    break;
                case 8:
                    grade[i] = 'B';
                    break;
                case 7:
                    grade[i] = 'C';
                    break;
                case 6:
                    grade[i] = 'D';
                    break;
                default:
                    grade[i] = 'F';
            }

        }
        for (int i = 0; i < Inwon; i++) {
            System.out.println("\n\n****  " + name[i] + "님의 성적표 **********");
            System.out.println("국어 : " + kor[i] + " 영어 : " + eng[i] + " 전산 : " + com[i]);
            System.out.printf("총점 : %d 평균 : %.1f 평점(학점) : %c", tot[i], avg[i], grade[i]);
        }
    }
}
