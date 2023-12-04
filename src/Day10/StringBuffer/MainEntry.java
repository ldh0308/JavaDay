package Day10.StringBuffer;

public class MainEntry {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); // 초기 용량 16 메모리 공간 사이즈 맞게 재조정

        System.out.println(sb.length() + " / " + sb.capacity());

        System.out.println("-----encore 입력-------");
        sb.append("encore");
        System.out.println(sb.length() + " / " + sb.capacity());
        System.out.println("----1234567777777777 입력------");
        sb.append("1234567777777777");
        System.out.println(sb.length() + " / " + sb.capacity());
        System.out.println("----123456777777777733333333333333 입력------");
        sb.append("123456777777777733333333333333");
        System.out.println(sb.length() + " / " + sb.capacity());
    }
}
