package Day04;

public class DailyExample {
    //    1~100까지 중에서 짝수의 개수 구하고 한 화면에 10개씩 출력하기
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 != 0) {
                count++;

            }
            System.out.println(count); // 다시풀기//
        }



    }
}
