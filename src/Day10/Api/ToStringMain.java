package Day10.Api;

class Rectangle {
    int x, y;

    public void display() { // user method
        System.out.println(x + ", " + y);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class ToStringMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
//        r.display();
        System.out.println(r);
    }
}
