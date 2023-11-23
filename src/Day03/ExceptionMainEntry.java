package Day03;

public class ExceptionMainEntry {
    public static void main(String[] args) {
        int x = 30, y = 0;
        int result = 0;

        if( y == 0 ) {
            System.out.println("0으로 나눌 수 없습니다.");
            return;
        } else {
            result = x / y; //예외발생
        }
        System.out.println();
    }
}
