package extends1.super1;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }
    
    public void call() {
        System.out.println("this value = " + this.value); // this 생략가능
        System.out.println("super value = " + super.value); // super 는 부모에서 참조

        this.hello(); // this 생략가능
        super.hello();
    }
}
