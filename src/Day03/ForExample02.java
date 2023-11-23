package Day03;

// 1~100중에 3의 배수의 합과 개수 구하는 프로그램 작성
public class ForExample02 {
    public static void main(String[] args) {
        int sum = 0, count = 0;

        for (int i = 1; i <= 100; i++) {
            if( i % 3 == 0 ) { // 나머지가 0이라면 true
                sum += i;
                count++;
            }
        }
        System.out.println("sum = " + sum + ", count = " + count);
    }
}
