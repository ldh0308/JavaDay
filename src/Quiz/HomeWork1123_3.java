package Quiz;

public class HomeWork1123_3 {
    public static void main(String[] args) {
//        과제3] 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 9/10 = ?
//        0.5 + 0.66 + 0.75 + 0.8 + 8.3 + 0.85 +0.87 +
        double sum = 0;
        for (int i = 1; i < 10; i++) {
            sum +=  (double) i / (i + 1);
        }
        System.out.printf("%.2f",sum);
    }
}
