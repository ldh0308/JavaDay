package Inheritance;

import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);
    protected String number,name;

    public Person() {}

    public void input() {
        System.out.println("번호 입력");
        number = sc.next();
        System.out.println("이름 입력");
        name = sc.next();
    }
    //output
    public void disp(){
        System.out.println("번호 : " + number + " 이름 : " + name);
    }
}
