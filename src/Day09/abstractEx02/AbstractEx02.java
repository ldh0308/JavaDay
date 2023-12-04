package Day09.abstractEx02;

public abstract class AbstractEx02 {
    double result = 0;

    public abstract double calc1(double x); // 추상메서드
    public abstract void show(String name); // 추상메서드

    public void view() {
        System.out.println("super class 입니다.");
    }
}
