package Day04;

public class MultiWhile {
    public static void main(String[] args) {
        int a = 1, b = 1;
        while (a <= 2) {

            while (a <= 2) {

                while (b <= 3){
                    System.out.println(b + "\t");
                    b++;
                }

                a++;
                System.out.println();
            }
        }
    }
} //
