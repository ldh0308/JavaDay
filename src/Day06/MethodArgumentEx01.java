package Day06;

public class MethodArgumentEx01 {

    public static void plus(int...x) { //가변 길이 배열
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        plus(1,2,3,4);
    }
}
