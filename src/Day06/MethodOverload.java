package Day06;
// overload(중복함수)
public class MethodOverload {
    public static double plus(int x, int y, int z, int a) { // 함수원형 타입 - double 원형타입이 더 높음
        return x + y + z + a; // return int
    }
    public static void add(String str1, String str2) {
        System.out.println(str1 + str2);
        }
    public static void add(int str1, int str2) {
        System.out.println(str1 + str2);
    }
    public static void add(double str1, String str2) {
        System.out.println(str1 + str2);
    }
    public static String name(String name) {
        return name;
    }
    public static String name(String name, int age){
        return name + " , " + age;
    }
        public static void main(String[] args) {


    }
}
