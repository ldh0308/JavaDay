package Day09.abstractEx02;

public class Rectangle extends AbstractEx02 {
    double y = 5;
    @Override
    public double calc1(double x) {
        result = x * y;
        return result;
    }

    @Override
    public void show(String name) {
        System.out.println("사각형너비 = " + result);

    }
}
