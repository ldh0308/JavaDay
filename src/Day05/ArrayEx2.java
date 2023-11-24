package Day05;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
//         배열에 속한 값 더하기
//        int[] arr = {1, 2, 3, 4, 5};
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println("1, 2, 3, 4, 5 sum = " + sum);

        // 배열 입력 받아 출력 하기
        int[] arr1 = new int[5];
        int sum = 0;
        System.out.println("정수 데이터 입력");

        Scanner sc = new Scanner(System.in);
       for (int i = 0; i < arr1.length; i++) {
           arr1[i] = sc.nextInt();
           sum += arr1[i];
       }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println("\nsum = " + sum);

    }
}
