package Quiz;

public class HomeWork1123_3 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (double) i / (i + 1);
        }
        System.out.printf("%.2f",sum);
        // sum += ; i / i+1
    }
}
