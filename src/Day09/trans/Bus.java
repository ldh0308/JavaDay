package Day09.trans;

public class Bus extends Trans {
    @Override
    public void input() {
    }

    @Override
    public int start(int x) {
        x = 1;
        return x;
    }

    @Override
    public int stop(int y) {
        y = 2;
        return y;
    }

    @Override
    public void show() {
        if (start(sc.nextInt()) == 1) {
            System.out.println("출발합니다.");
        } else {
            System.out.println("정지합니다.");
        }

    }
}
