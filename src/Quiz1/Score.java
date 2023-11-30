package Quiz1;

import java.util.Scanner;

public class Score {
    //멤버변수
    private int kor, eng, com, total;
    private double avg;
    private String name;
    private char grade;

    public Score(){
    }
    public Score(int kor, int eng, int com, int total, double avg) {
        this.kor = kor;
        this.eng = eng;
        this.com = com;
        this.total = total;
        this.avg = avg;
    }
    public Score(String name) {
        this.name = name;
    }
    public Score(char grade) {
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        switch ( (int) avg / 10 ) {	//switch ( total / 30 ) {
            case 10:
            case 9: grade = 'A';	break;
            case 8: grade = 'B';	break;
            case 7: grade = 'C';	break;
            case 6: grade = 'D';	break;
            default: grade= 'F';
        }
        this.grade = grade;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        total = kor + eng + com;
        this.total = total;
    }

    public int getAvg() {
        return (int) avg;
    }

    public void setAvg(double avg) {
        avg = total / 3.0;
        this.avg = avg;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Score(int kor) {
        this.kor = kor;
    }

    // getter / setter method

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    // output
    public void disp() {
        System.out.println(name + "님의 성적표 *****" + "\n국어 : " + kor + ", 영어 : " + eng + ", 전산 : " + com);
        System.out.printf("총점 : %d 평균 : %.1f 평점(학점) : %c",total,avg,grade);
    }
}
