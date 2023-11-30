package Inheritance;

public class Score extends Student{
    protected int kor,eng,com;
    protected double total,avg;


    public void input() {
        super.input();

        System.out.println("국어점수 입력");
        kor = sc.nextInt();
        System.out.println("영어점수 입력");
        eng = sc.nextInt();
        System.out.println("전산점수 입력");
        com = sc.nextInt();
    }
    public double getTotal(){
        return kor + eng + com;
    }
    public double getAvg(){
        return getTotal() / 3.0;
    }
    public void disp(){
        super.disp();
        System.out.println("국어점수 : " + kor + ", 영어점수 : " + eng + ", 전산점수 : " + com);
        System.out.printf("총점 : %.2f 평균 : %.2f", getTotal(), getAvg());
    }
}
