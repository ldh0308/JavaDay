package Day08;

public class Employee {
    protected int number;
    protected String phone,name, dept;

    public Employee(){
    super();
    }

    public Employee(int number) {
        this.number = number;
    }

    public Employee(int number, String phone, String name, String dept) {
        this.number = number;
        this.phone = phone;
        this.name = name;
        this.dept = dept;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void disp() {
        System.out.println("사번 : " + number + " 이름 : " + name + " 부서 : " + dept + " 전화번호 : " + phone);
    }
}
