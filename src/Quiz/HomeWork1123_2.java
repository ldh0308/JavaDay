package Quiz;

public class HomeWork1123_2 {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        for (int i = -1; i >= -9; i--) {
            if (i % 2 != 0) {
                sum1 += i;
            }
        }
        System.out.println(sum + sum1);
    }
}
