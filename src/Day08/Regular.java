package Day08;

public class Regular extends Employee{
    private double money = 1000000;

    public Regular() {
        super();
    }

    public Regular(int number, int a) {
        super(number);
        this.money = a;
    }

    public Regular(int number, String phone, String name, String dept, double money) {
        super(number, phone, name, dept);
        this.money = money;
    }

    public double getMoney() {
        if (getDept() == "영업") {
            money += money * 0.3;
        }
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
