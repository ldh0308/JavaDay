package Day10.string;

public class MainEntry {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("str : " + str);
        char data[] = {'a', 'b', 'c'};
        char ch = str.charAt(0);
        System.out.println(ch);
        System.out.println(str.charAt(2));

        str = new String(data);

        String msg = "aksdjfkla;jd";
        System.out.println(ch + msg);

        String str2 = "abcde".substring(2); // 중간 값 출력
        System.out.println(str2); // cde

        str2 = "abcdefghijklmn".substring(2, 5); // 시작값 포함, 끝값 미포함
        System.out.println(str2); // cde
        System.out.println();

        String s3 = "seoul";
        String s4 = "seoul";

        if (s3 == s4) {
            System.out.println("same");
        } else {
            System.out.println();

        }
    }
}
