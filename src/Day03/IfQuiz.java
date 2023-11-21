package Day03;

import java.util.Scanner;

public class IfQuiz { // 양수, 음수, 0
    public static void main(String[] args) {
        System.out.println("integer date : ");
        int Num = new Scanner(System.in).nextInt();

        if(Num > 0) {
            System.out.println("양수입니다.");
        }else if(Num == 0) {
            System.out.println("0 입니다.");
        } else {
            System.out.println("음수입니다.");
        }
    }
}
