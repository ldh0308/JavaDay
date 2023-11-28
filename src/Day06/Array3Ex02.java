package Day06;

import java.util.Scanner;

// 3차원 형태
// 임의적인 데이터 입력 받아 출력 하기
public class Array3Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.
        int[][][] a = new int[2][2][3]; // [면크기][행크기][열크기]
        //2.
        int[][][] b = new int[][][]{{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        //3.
        int[][][] c = {{{0, 0, 0}, {0, 0, 0}}, {{0, 0, 0}, {0, 0, 0}}};
        int x = 1;

        for (int i = 0; i < a.length; i++) { //면

            for (int j = 0; j < a.length; j++) {// 행

                for (int k = 0; k < a[i][j].length; k++) { //
//                    a[i][j][k] = (int)(Math.random() * 100);
                    a[i][j][k] = x++ * 5;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}