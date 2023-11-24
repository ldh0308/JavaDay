package Day05;

import java.util.Random;

public class RandomArrayEx1 {
    public static void main(String[] args) {
//        System.out.println(Math.random()); // 0.0 ~ 1.0
//        System.out.println(Math.random() * 5);
//        System.out.println((int)(Math.random() * 5));
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print(((int)Math.random() * 45) + 1); // 재확인하기
//        }
        Random rand = new Random();
//        int n = 3;
//        System.out.println(rand.nextInt(n)); // 0 ~ n-1 값
//        System.out.println(rand.nextInt(5)); // 0 ~ 4 값

        System.out.println("Random class 이용");
        for (int i = 0; i < 5; i++) {
            System.out.print(rand.nextInt(45) + 1 + "\t"); //1~45까지 출력
        }
    }
}
