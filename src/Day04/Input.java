package Day04;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("name, str input : ");
        String name = sc.next(); // 공백인식못함
//        String name = sc.nextLine()
        System.out.println(name);

        int su = sc.nextInt();
        System.out.println(su + ", " + name
        );
    }
}
