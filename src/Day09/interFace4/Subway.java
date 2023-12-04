package Day09.interFace4;

import java.util.Scanner;

public class Subway implements Trans{
    Scanner sc = new Scanner(System.in);
    String trans ;

    @Override
    public void start() {
        System.out.println("출발합니다.");
    }

    @Override
    public void stop() {
        System.out.println("정지합니다. ");

    }

    public void input() {
        System.out.println("지하헐");


    }

}
