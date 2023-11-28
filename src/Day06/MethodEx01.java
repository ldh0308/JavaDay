package Day06;

public class MethodEx01 {
//매개변수 없고, 리턴타입 없는 경우
//public returnType methodName() {}
    public static void line() { // 함수 정의부
        System.out.println("-------------------------");
    }
//    매개변수 있고, 리턴타입 없는 경우
//    public returnType methodName(parameter val1, parameter val2,…){}
    public static void showName(String name, int age) { //함수 정의부
        System.out.println("당신의 이름은 " + name + " 이시군요.");
        System.out.println("당신의 나이는 " + age + "살 이군요.");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        line(); // 함수 호출
        display();
        line();
        System.out.println("main end");
        showName("이동혁",29);
    }

    public static void display() { // 함수정의부
        System.out.println("happy donghyuk");
    }
}
