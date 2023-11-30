package Day08;

import java.util.Scanner;
public class Sales {
    private double bonus;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Regular regular = new Regular();


        System.out.println("사번");
        regular.setNumber(sc.nextInt());
        System.out.println("이름");
        regular.setName(sc.next());
        System.out.println("부서");
        regular.setDept(sc.next());
        System.out.println("연락처");
        regular.setPhone(sc.next());
        System.out.println(regular.getMoney());
        regular.disp();
    }
}
