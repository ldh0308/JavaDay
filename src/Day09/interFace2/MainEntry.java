package Day09.interFace2;

public class MainEntry {
    public static void main(String[] args) {
        //1. 자기자신
        BB b = new BB();
        b.draw();
        b.show();

        //2. 부모활용
        Idraw bb = new BB();
        bb.draw();
    }
}
