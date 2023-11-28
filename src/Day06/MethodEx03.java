package Day06;
//매개변수 없고, 리턴타입 있는 경우
//public returnType methodName() { return value; }
public class MethodEx03 {
    public static String show() {
//        return "Hello String";
        String str = "Hello World";
        return "100";
    }
    public static int ishow() {
        int su = 99;
        return su;
    }

    public static void main(String[] args) {
        String msg = show();
        System.out.println(msg);
        System.out.println(show());
        System.out.println(ishow());
        int num = ishow();
        System.out.println(num);
    }
}
