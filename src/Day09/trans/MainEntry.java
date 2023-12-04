package Day09.trans;

public class MainEntry {
    public static void main(String[] args) {
        Trans tr = new Bus();
        Trans tr1 = new Subway();

        System.out.println("출발신호 = 1 / 정지신호 = 2");
        System.out.println("Bus");
        tr.show();
        System.out.println("============================");
        System.out.println("Subway");
        tr1.show();
    }
}
