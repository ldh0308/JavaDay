package Day10.wrapper;

class Point{}

public class MainEntry {
    public static void main(String[] args) {
        Integer Ia = new Integer(9);
        Integer Ib = new Integer("9");
        String su = "30";
        int x = 10;
        Point pt = new Point();

        System.out.println(pt); // 주소
        System.out.println(pt.toString());
        System.out.println(pt.hashCode());

        System.out.println(Ia);
        System.out.println(Ia.toString());
        System.out.println(Ia.hashCode());
        System.out.println(Ia.getClass().getName() + '@' + Integer.toHexString(Ia.hashCode()));

        // Boxing vs UnBoxing
        int y = 5;
        double d = 3.3;
        d = y; // 묵시적 형변환
        y = (int)d; // 명시적 형변환

        int c = Ia.intValue();
        int e = Ib;
        int num = Integer.parseInt(su);

        System.out.println(c + num);
        System.out.println(c + e);
        System.out.println(Ia);

        Double dd = new Double(12.34);
        System.out.println(Integer.MAX_VALUE);

        int f = Integer.parseInt("123");
        int g = Integer.parseInt("1111111", 2);
        System.out.println(f);
        System.out.println(g);

        int h = 3; // stack memory
        Integer i = new Integer(3); // heap memory

        System.out.println(Integer.toOctalString(10));
        System.out.println(Integer.toHexString(10));

    }
}
