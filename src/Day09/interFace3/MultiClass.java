package Day09.interFace3;

import Day09.abstractEx02.AbstractEx02;
import Day09.interFace2.Idraw;

public class MultiClass extends AbstractEx02 implements Idraw, Test {
    String irum = "이순신";

    @Override
    public double calc1(double x) {
        return 0;
    }

    @Override
    public void show(String name) {

    }

    @Override
    public void draw() {

    }

    @Override
    public void tshow(String name) {

    }
}
