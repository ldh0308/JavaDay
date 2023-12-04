package Day09;

abstract class AbstractShape { //abstract class, super class
    double result = 0;
    public abstract double calc();
    public abstract void draw();

    public void show() {
        System.out.println("Super class Shape");
    }
}

class Circle extends AbstractShape {
    double r = 5.0;
    @Override
    public double calc() {
        result = r * r * Math.PI; // 부모가 가지고 있기 때문에 사용가능
        return result;
    }

    @Override
    public void draw() {
        calc();
        System.out.println("원의 넓이 : " + result + " 인 원을 그렸습니다. ");
    }

    @Override
    public void show() {
        super.show();
    }
}

class Triangle extends AbstractShape{
    int w = 3, h = 5;
    @Override
    public double calc() {
        result = (w * h) / 2;
        return result;
    }

    @Override
    public void draw() {
        calc();
        System.out.println("삼각형의 넓이 : " + result + "인 삼각형을 그렸습니다. ");

    }
}
//사각형의 너비
class Square extends AbstractShape{
    int w = 3, h = 5;
    @Override
    public double calc() {
        result = w * h ;
        return result;
    }

    @Override
    public void draw() {
        calc();
        System.out.println("사각형의 넓이 : " + result + "인 사각형을 그렸습니다.");

    }

}
public class MainEntry{
    public static void main(String[] args) {
        Circle c = new Circle();
        new Triangle().draw();
        new Square().draw();
        c.draw();
        System.out.println("============Circle 상속========");
        AbstractShape sh = new Circle(); // 상속받은 자손으로 객체생성 가능
        sh.draw();
        System.out.println("============Square 상속========");
        AbstractShape as = new Square(); // Square 클래스 안에 있는 draw 생각
        as.draw();
    }
}
