package Day06;

public class MethodOverloadEx01 {
    public static void line() {
        System.out.println("----------------");
    }
    public static void line(String str) {
        for (int i = 1; i < 11; i++) {
            System.out.print(str);
        }
        System.out.println();
    }
    public static void line(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(str);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        line("가",5);
        line();
        line("가");
    }
}
