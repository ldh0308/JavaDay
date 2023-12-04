package Day09.abstractEx02;

import Day09.abstractEx02.Circle02;

public class MainAbstractEx02 {
    public static void main(String[] args) {

        AbstractEx02[] ss = new AbstractEx02[3];
        ss[0] = new Circle02();
        ss[1] = new Rectangle();
        ss[2] = new Triangle02();

        String[] name = {"Circle", "Rectangle", "Triangle02" };

        for (int i = 0; i < ss.length; i++) {
            ss[i].show(name[i]);
        }

//        AbstractEx02 sh = new Circle02();
//        sh.show("원원원");
//        sh = new Rectangle();
//        sh.show("사각");

    }
}
