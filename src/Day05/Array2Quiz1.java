package Day05;

import java.util.Scanner;

public class Array2Quiz1 {
    public static void main(String[] args) {
        //임의의 수를 입력 받아서 합[2행 3열]
        Scanner sc = new Scanner(System.in);
        int su = 2;
        int su1 = 3;
        int[][] num = new int[su][su1];
//        int[][] sum = new int[su][su1];
        int sum = 0;

        System.out.println("숫자 6개를 입력하세요");
        for (int i = 0; i < su; i++) {
            for (int j = 0; j < su1; j++) {
                num[i][j] = sc.nextInt();
//                sum[i][j] ;
            }
            sum ++;
        } System.out.println(sum);
    }
}
