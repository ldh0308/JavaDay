package Day04;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x = 1~9까지 입력");
        int x = sc.nextInt();
        int a = 1;

        while (a <= 9){
            System.out.println(x + "*" + a + "=" + (x * a));
            a++;
        }
        // do ~ while
        System.out.println("\n3do-while 문");
        x = new Scanner(System.in).nextInt();
        System.out.println("x = 1~9까지 입력");
        a = 1;

        do {
            System.out.println(x + "*" + a + "=" + (x * a));
            a++;
        } while (a <= 9);

    }
} //
