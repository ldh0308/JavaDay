package Day03;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("input jumsu(k,e,c) = ");
        int k = new Scanner(System.in).nextInt();
        int e = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();

        int total = (k + e + c);
        double avg = (double) total / 3;
        char grade;


        //switch (total / 30) {
        switch ((int)avg / 10) {
            case 10:
            case 9 :
                grade = 'A';
                break;
            case 8 :
                grade = 'B';
                break;
            case 7 :
                grade = 'C';
                break;
            case 6 :
                grade = 'D';
                break;

            default: grade = 'F';
        }
        System.out.println("\n\n" + total + " ==> " + grade + "학점");
    }
}
