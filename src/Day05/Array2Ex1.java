package Day05;

public class Array2Ex1 {
    public static void main(String[] args) {
//        int[][] a = new int[2][3];
//        int[][] a = new int[][] {{1, 2, 3}, {4, 5, 6}}; //2행 3열
        int[][] a = new int[][] {{1, 2, 3}, {4, 5, 6}}; //2행 3열

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j <3; j++){
                System.out.println(a[i][j]);
            } // j end
        } // i end
        // 배열 값 출력
//        System.out.println("a3[0][2] = " + a3[0][2]);
//        System.out.println("a3[1][1] = " + a3[1][1]);
//        System.out.println("배열의 행크기 : " + a3.length);
//        System.out.println("배열의 열크기 : " + a3[0].length);
//        System.out.println("배열의 열크기 : " + a3[1].length);
    }
}
