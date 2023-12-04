package Day09.abstractEx02;

import Day09.abstractEx02.AbstractEx02;

public class Triangle02 extends AbstractEx02 {
    double y = 5;
    @Override
    public double calc1(double x) {
        result = (x * y) / 2.0;
        return result;
    }

    @Override
    public void show(String name) {
        calc1(3);
        System.out.println("삼각형 너비 = " + result);

    }
}
