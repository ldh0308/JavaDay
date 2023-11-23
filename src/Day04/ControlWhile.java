package Day04;

public class ControlWhile {
    public static void main(String[] args) {
        System.out.println("for ---");
        for (int i = 1; i < 4; i++){
            System.out.print(i + "\t");
        }
        System.out.println("\nwhile ---");
        int a = 1; // 변수의 초기화 필수
        while ( a <= 3) { // while( a++ <= 3) { System.out.println(a + "\t"); }
            System.out.print(a + "\t");
            a++; //증감식
        }
        System.out.println(a);

        System.out.println("\ndo-while");
        int b = 1;
        do {
            System.out.print(b + "\t");
            b++;
        } while( b <= 3);
    }
}
