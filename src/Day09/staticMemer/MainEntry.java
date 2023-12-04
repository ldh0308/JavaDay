package Day09.staticMemer;

class Atm {
    int count; // instance member
    static int total; // static member

    public Atm(int amount) { // 생성자 함수 constructor
        count += amount; // count = count + amount;
        total += amount; // total = total + amount;
    }
    public static void view() {
//        count = count + 100; // static 메소드에서는 일반 멤버 변수는 사용 할 수 없다.
        total = total + 100; // static 메소드에서는 static 멤버 변수는 사용 가능.
    }
    public void show(int count, int total) {
        this.count = count;
//        this.total = total; // static member에는 this 사용하지 않는다.
    }
    public void display() {
        count = count + 200; // 인스턴스 메소드에서는 두 멤버 변수 사용가능.
        total = total + 200;
        System.out.println("count = " + count + ", total = " + total);
    }
} // Atm class end
public class MainEntry {
    public static void main(String[] args) {
        Atm at = new Atm(1000);
        at.display(); // c : 1000, t : 1000
        System.out.println("=================");
        Atm at2 = new Atm(1000);
        at2.display();
        System.out.println("=================");
        Atm at3 = new Atm(1000);
        at3.display();

        System.out.println(Atm.total);
        System.out.println(at.count);
    }
}
