package Day10.string;

public class Quiz {
    public static void main(String[] args) {
        String str = "abcDEFGHeijwEIMPYmnqr";

        String str1 = str.substring(0,3).toUpperCase();
        String str2 = str.substring(4,8).toLowerCase();
        String str3 = str.substring(8,12).toUpperCase();
        String str4 = str.substring(12,16).toLowerCase();
        String str5 = str.substring(16,20).toUpperCase();

        System.out.println(str1 + str2 + str3 + str4 + str5);
    }
}
