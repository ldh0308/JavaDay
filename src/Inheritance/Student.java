package Inheritance;

import java.util.Scanner;

public class Student extends Person {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person person = new Person();

        System.out.println("번호를 입력");
        person.number = sc.next();
        System.out.println("이름을 입력");
        person.name = sc.next();


        person.disp();


    }

}
