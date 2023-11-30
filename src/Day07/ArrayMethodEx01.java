package Day07;

public class ArrayMethodEx01 {
    public static void main(String[] args) {
        int x = 3, y = 5;

        int result = methodEx(x,y);
        System.out.println(result);

        int[] arrResult = methodEx2();
        for (int i = 0; i < arrResult.length; i++) {
            System.out.print(arrResult[i] + "\t");
        }
        for (int item : arrResult) {
            System.out.print(item + " ");
        }
    }

    public static int[] methodEx2() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        return arr;
    }

    public static int methodEx(int x, int y) {
        return x + y;
    }
}
