package Day04;

public class BreakConitinue {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i == 7) break;
            System.out.println(i);
        }
        for (int i = 1; i < 7; i++) {
            if (i == 7) continue;
            System.out.println(i);
        }
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 7) continue;
            System.out.println(i);
        }
    }
}
