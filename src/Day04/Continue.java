package Day04;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        System.out.println("정수 데이터 입력 요망 : ");
        Scanner sc = new Scanner(System.in); // 객체생성, 메모리할당, 생성자함수 자동호출//

        System.out.println("integer, double, char data input ; ");
        int x = sc.nextInt();
        double y = sc.nextDouble();
        char ch = sc.next().charAt(0);

        System.out.println(x + ", " + y + ", " + ch);
    }
}
