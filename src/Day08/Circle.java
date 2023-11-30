package Day08;

public class Circle extends Point{ // Sub Class
    private int r;

    public Circle() {
        r = 5;
        System.out.println("Circle default constructor call");
    }

    public Circle(int x, int y, int r) {
        this.r = r;
        System.out.println("Circle 3개 constructor call");
    }

    public Circle(int r) {
        this.r = r;
        System.out.println("Circle 1개 constructor call");
    }
    public void disp() {
        System.out.println(" , " + r);
    }
}

