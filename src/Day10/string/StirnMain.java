package Day10.string;

public class StirnMain {
    public static void main(String[] args) {
        String s4 = new String("kk dfsaf fasdf ");

        String s2 = "Korea";

        String s7 = "1234567890abcdef";
        char ch = s7.charAt(15);
        System.out.println(ch);
        System.out.println(s7.indexOf('f'));
        System.out.println(s7.lastIndexOf('f'));

        System.out.println(s7.substring(3));
        System.out.println(s7.substring(5,7));

        System.out.println();
    }
}
