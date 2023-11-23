package Quiz;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Num1 = ");
        int Num1 = sc.nextInt();
        System.out.println("Num2 = ");
        int Num2 = sc.nextInt();
        System.out.println("+,-,*,/ 를 입력하세요");
        String result = sc.next();
        int sum = 0;

        switch (result) {
        case "+" :
                sum = Num1 + Num2;
        break;
        case "-" :
                sum = Num1 - Num2;
        case "/" :
                sum = Num1 / Num2;
        break;
        case "*" :
                sum = Num1 * Num2;
        break;

            default:
        System.out.println("삑~~");

        }
        System.out.printf("%d %s %d = %d",Num1,result,Num2,sum);
    }
}
