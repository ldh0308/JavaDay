package Day09.interFace;

interface A {
    int x = 9; // interface - abstract method, final member 만 가질 수 있다.

    public void show(); // abstract
    public abstract void disp();
    public int plus(int x, int y);
} // A end
interface B{
    void bView();
} // B end
interface C {
    String name = "happy"; // 초기화 하지 않으면 에러
    public void draw();

//    name = "dong"; // final 멤버는 값 변경 금지 = 상수
}
interface D extends B { // interface 간의 상속도 extends 사용
    void dView();
} // D end
class Rect implements C{
    @Override
    public void draw() {
        System.out.println(name + "님 반갑습니다.");
    }
}
class Multi extends Ex01 implements B,C,A{
    @Override
    public void show() { //A
        System.out.println("A interface");
    }

    @Override
    public void disp() { //A
        System.out.println("disp call");
    }

    @Override
    public int plus(int x, int y) {
        System.out.println("plus call");
        return 222;
    }

    @Override
    public void bView() {
        System.out.println("bView call");
    }

    @Override
    public void draw() {

    }

}
public class Ex01 {
    public static void main(String[] args) {
//        A a = new A(); // 객체 생성 불가. 클래스 아님
        Rect r = new Rect(); // 자기 사진으로 객체 생성 가능.
        r.draw();
        C rr = new Rect(); // 부모의 C 인스턴스로 생성가능.
        rr.draw();

        Multi m = new Multi();
        m.bView();
        m.disp();

        Ex01 m2 = new Multi();
        B m3 = new Multi();
    }
}
