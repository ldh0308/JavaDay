package Day05;

import java.util.Scanner;

// 11월 한달 간(30일)의 강수량을 입력 받아서, 평균 구하는 프로그램 작성.
public class ArrayQuiz2 {
    public static void main(String[] args) {
        System.out.println("강수량을 입력하세요");
        Scanner sc = new Scanner(System.in);
//        int[] arr1 = new int[5];
        double day = 2, avg = 0, sum = 0;
        double[] su = new double[(int) day];

        for (int i = 0; i < su.length; i++) { // 강수량입력받을 값
            su[i] = sc.nextInt();
//            avg = su / day;
            System.out.println(su);
        }
//        System.out.println("강수량 평균 = " + sum);

    }
}