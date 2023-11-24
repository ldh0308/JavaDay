package Day05;

public class Array2Quiz2 {
    public static void main(String[] args) {
//        int[][] num= new int[3][4];
        int[][] num = {{1, 2, 3, 4}, {1, 1, 1, 1}, {0, 0, 0, 0}};
//
//        num[0][0] = 1;  num[0][1] = 2; num[0][2] = 3; num[0][3] = 4;
//        num[1][0] = 5;  num[1][1] = 6; num[1][2] = 7; num[1][3] = 8;
//        num[2][0] = 0;
//        num[2][1] = 0;
//        num[2][2] = 0;
//        num[2][3] = 0;

//        System.out.println(num[2][3]);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < num[i].length; j++) {
                    num[i][j] = num[0][j] + num[1][j];
                }
                System.out.println(num[2][i]);
            }
        }
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                if (i == 2) {
//                    num[i][j] = num[0][j] + num[1][j];
//                }
//                System.out.println(num[2][i]);
//            }
//        }
    }


