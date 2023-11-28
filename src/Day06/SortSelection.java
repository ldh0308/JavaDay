package Day06;
// 선택 소트 : 기준 있음
public class SortSelection {
    public static void main(String[] args) {
        int[] a = {7, 3, 2, 5, 8};
        int temp;

        System.out.println("***** sort 전 출력 ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        //sort
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) { // 부등호 바꾸면 내림차순으로 정렬
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\n***** sort 후 출력 ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
