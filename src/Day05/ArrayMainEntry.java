package Day05;

public class ArrayMainEntry {
    public static void main(String[] args) {
        char[] ch; // 배열 선언
        ch = new char[4]; // 배열 생성
        char[] ch2 = new char[4]; // 배열 선언과 동시에 생성
        ch2[0] = 'A';
        ch2[1] = 'B';
        ch2[2] = 'C';
        ch2[3] = 'D';

//        System.out.println(ch2[0]);
        for (int i = 0; i < 4; i++) {
//            System.out.println("ch[" + i +"]" + " = " + ch2[i]);
            System.out.printf("ch2[%d] : %c\n", i, ch2[i]);
        }
        System.out.println("=======================");
        char[] ch3 = {'j', 'a', 'v', 'k', 'i'};
        System.out.println("배열의 길이 : " + ch3.length);
        System.out.println("=======================");

        char[] ch4 = {'j', 'a', 'v', 'k', 'i'};
        for (int i = 0; i < ch4.length; i++) {
            System.out.printf("ch4[%d] : %c\n", i, ch4[i]);
        }
        System.out.println("=======================");
        String[] str = {"가", "나", "다", "라", "마"};
        for (int i = 0; i < str.length; i++) {
            System.out.printf("ch4[%d] : %s\n", i, str[i]);
        }

        char[] ch5 = {};
        char[] ch6 = new char[]{};
    }
}
