package Testtt;

class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "auto", 4);
    }
    Car(String color){
        this(color, "auto", 4);
    }
    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1  /* c1 변수선언 */= new Car(); // 객체 또는 인스턴스
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4);
        Car c3 = new Car("pink");

        System.out.println("c1의 color = " + c1.color + " c1의 gearType = " + c1.gearType + "c1의 door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + " c2의 gearType = " + c2.gearType + "c2의 door = " + c2.door);
        System.out.println("c3의 color = " + c3.color + " c3의 gearType = " + c3.gearType + "c3의 door = " + c3.door);


    }
}

