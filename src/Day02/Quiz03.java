package Day02;

public class Quiz03 {
    public static void main(String[] args) {
        int guk = 90;
        int eng = 88;
        int elt = 100;

        int tot = guk + eng + elt;
        double avg = tot / 3.0f; //3f

        System.out.println("이동혁님의 성적표****");
        System.out.println("국어 : " + guk +", 영어 : " + eng + ", 전산 : " + elt);
        System.out.printf("총점 : %d 평균 : %.2f", tot, avg); // 앞에 형식 정하고, 뒤에 변수 나열, 형식공부
    }
}
