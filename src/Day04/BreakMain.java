package Day04;

public class BreakMain {
    public static void main(String[] args) {
        label : // 식별자 : //
        for (int i = 1; i < 6; i++) {
            for(int j = 1; j < 6; j++) {

//                if (j == 3) break label;
                if (j == 3) continue label;
                System.out.println("i : " + i + ", j : " + j);
            }
        }
    }
}
