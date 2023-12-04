package Day09.interFace2;

public class BB implements Idraw{
    @Override
    public void draw() {
        System.out.println("BB 클래스에서 인터페이스 Idraw의 메소드를 오버라이드함");
        System.out.println(su);
    }

    public void show() {
        System.out.println(su);
    }
}
