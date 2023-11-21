package Day02;

public class OperatorTest {
    public static void main(String[] args) {
        // 논리 연산자 : && (ans), || (or), !(not) 10진 논리 ==> 결과 : 참, 거짓
        int x = 10, y = 20, z = 30;
        boolean result = true;

        result = (x > y) && ( y > z); // && 연산은 앞에 것이 거짓이면 뒤는 수행하지 않음
        System.out.println("result = " + result);

        result = (x < y) || (y < z);
        System.out.println("result = " + result);

        result = (x < y) || (y < z); // || 연산은 앞에 것이 참이면 뒤는 수행하지 않음
        System.out.println("result = " + result);

    }
}

    /*// 관계연산자 : > , <, >=, <=, ==, !=
    int x = 3, y= 5;

    boolean flag = true;
        System.out.println(!flag); // ture -> false, false -> true
                // 0, 0.0, NULL (<< 왼쪽 전부 거짓)를 제외한 모든 값은 '참'이다.

                if( x != y) {// if( x == y) { // if( x >= y) { //if( x > y) {
                System.out.println("max : " + x);
                System.out.println("true");
                } else {
                System.out.println("max = " + y); */

    /* // 논리 연산자 : & (ans), | (or), ^(xor) 2진 논리 ==> 결과 : 값
    int x = 4, y = 7;

        System.out.println( x & y); // 4
                System.out.println( x | y); // 7
                System.out.println( x ^ y); // 3 */