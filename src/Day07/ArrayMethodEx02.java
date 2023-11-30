package Day07;

public class ArrayMethodEx02 {
    public static void main(String[] args) {
        int[][] resultArr = methodEx03();
        int sum = 0;
        for (int i = 0; i < resultArr.length; i++) {
            for (int j = 0; j < resultArr[i].length; j++) {
                System.out.print(resultArr[i][j] + "\t");
                sum += resultArr[i][j];
            }
            System.out.println();
        } System.out.println(sum);

        //확장 for문 사용
        System.out.println(" **** foreach 문으로 2차원 배열 데이터 출력 ****");
        for (int[] item : resultArr) { // item 에는 resultArr 배열이 들어가 있음.
            for (int arrItem : item) {
                System.out.print(arrItem + " ");
            }
            System.out.println();
        }
        System.out.println("\n===================");
        int index = 0;
        for (int[] item : resultArr) {
            System.out.println("index : " + index++);
            System.out.println(item); // 데이터가 들어 있는 주소 출력됨.
            System.out.println(item.hashCode()); // 메모리상의 주소(16진수)를 10진수 형태 메모리 주소로 보여줌.
        }
    }

    public static int[][] methodEx03() {
        int [][] arr = {{1,2,3,4,}, {1,2,3,4}};
        return arr;
    }

}
