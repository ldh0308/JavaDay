package Ex02;

public class Quiz03 {
    public static void main(String[] args) {
        int guk = 90;
        int eng = 88;
        int elt = 100;
        double avg = (guk + eng + elt) / 3.0f; //3f
        int tot = guk + eng + elt;


        System.out.println("국어 : " + guk +", 영어 : " + eng + ", 전산 : " + elt);
        System.out.printf("총점 : %d 평균 : %.2f", tot, avg);
    }
}
