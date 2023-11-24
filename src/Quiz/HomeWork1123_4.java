package Quiz;

import java.util.Scanner;

public class HomeWork1123_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("수를 입력하시오 :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max, mid, min;

        if (a == b || a == c || b == c) {
            System.out.println("같은수를 입력할수 없습니다");
            System.exit(0);
        }

        max = ((a > b) && (a > c) ? a : ((b > a) && (b > c)) ? b : ((c > a) && (c > b)) ? c : a);
        min = ((a < b) && (a < c) ? a : ((b < a) && (b < c)) ? b : ((c < a) && (c < b)) ? c : a);
        mid = mid = ((max > a) && (min < a)) ? a : ((max > b) && (min < b)) ? b :
                ((max > c) && (min < c)) ? c : a;

        System.out.println(max + " > " + mid + " > " +min);
    }
}
//    Scanner sc = new Scanner(System.in);
//    int num1 , num2, num3;
//    int temp;
//		System.out.println("====숫자 크기순 나열====\n");
//
//                try {
//                System.out.print("1) -> ");
//                num1 = sc.nextInt();
//                System.out.print("2) -> ");
//                num2 = sc.nextInt();
//                System.out.print("3) -> ");
//                num3 = sc.nextInt();
//
//                if(num1 > num2) {
//                if(num1 < num3){
//        temp = num1;  // 교환
//        num1 = num3;
//        num3 = temp;
//        }
//        if(num2 < num3){
//        temp = num2;
//        num2 = num3;
//        num3 = temp;
//        }
//        }
//        else if(num1 < num2){
//        temp = num1;
//        num1 = num2;
//        num2 = temp;
//        if(num1 < num3){
//        temp = num1;
//        num1 = num3;
//        num3 = temp;
//        }
//        if(num2 < num3){
//        temp = num2;
//        num2 = num3;
//        num3 = temp;
//        }
//        }
//        System.out.println("=====================================");
//        System.out.println("result : "+num1+ " > "+num2+ " > "+num3);
//        }
//        catch(InputMismatchException e) {
//        System.out.println("[Input Error]\nPlease Input Number!\n\n[Error Message]\n");
//        e.printStackTrace();
//
//        }
//        }
//
//        }
