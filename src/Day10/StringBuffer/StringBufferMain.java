package Day10.StringBuffer;

public class StringBufferMain {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This");
        System.out.println(sb);

        sb.append(" is pencil"); // 문자열 추가 append는 문자열 뒤로 추가
        System.out.println(sb);

        sb.insert(7, " my"); // 원하는 위치에 문자열 삽입
        System.out.println(sb);

        sb.replace(8, 10, "your");
        System.out.println(sb);

        System.out.println(sb.reverse()); // 문자열 역으로 출력
        System.out.println(sb.length()); // 문자열 길이 확인

        sb.setLength(5);
        System.out.println(sb);
        System.out.println(sb.capacity()); // 바이트
    }
}
