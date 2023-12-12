package chap_03;

// 추상 클래스
abstract class Bird {
    // 추상 메소드
    public abstract void sing();

    public void fly() {
        System.out.println("날다.");
    }
}

class Duck extends Bird {

    @Override
    public void sing() {
        System.out.println("꽥꽥!");
    }
}

public class _06_AbstractClass {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.sing();    // 날다
        duck.fly();     // 꽤꽥
    }
}
