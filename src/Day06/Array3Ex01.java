package Day06;

public class Array3Ex01 {
    public static void main(String[] args) {
        //1.
        int[][][] a = new int[2][2][3]; // [면크기][행크기][열크기]
        //2.
        int[][][] b = new int[][][]{{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        //3.
        int[][][] c = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};

        System.out.println("면길이 : " + c.length);
        System.out.println("행길이 : " + c[0].length);
        System.out.println("열길이 : " + c[0][0].length);
        System.out.println("열길이 : " + c[1][0].length);

        for (int i = 0; i < c.length; i++) { //면

            for (int j = 0; j < c.length; j++) {// 행

                for (int k = 0; k < c[i][j].length; k++) { //
                    System.out.print(c[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}