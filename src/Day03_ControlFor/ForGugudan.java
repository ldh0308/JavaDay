package Day03_ControlFor;

import java.util.Scanner;

public class ForGugudan {
    public static void main(String[] args) {
        System.out.println(" dan = ");
        int dan = new Scanner(System.in).nextInt();

        for (int i = 1; i <= 9; i++){
            System.out.println(dan + "*" + i + " = " + (dan+i));
    }
}
}
