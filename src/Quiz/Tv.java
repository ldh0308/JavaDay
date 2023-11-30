package Quiz;

public class Tv {
    String color;
    int channel;
// 중복 정의 가능
    public Tv() { // default constructor
        color = "gray";
        channel = 11;
    }
    public Tv(String color) {
        this.color = color;
    }
    public Tv(int channel) {
        this.channel = channel;
    }
    public  Tv(String color, int channel) {
        this.color = color;
        this.channel = channel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    //output
    public void disp() {
        System.out.println("TV의 색상 : " + color + "\n현재 채널 : " + channel);
    }
}
