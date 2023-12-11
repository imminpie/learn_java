package chap_03;

class Car {
    private String name;
    private int price;

    public Car() {
        System.out.println("기본 생성자가 호출됩니다.");
    }

    public Car(String name) {
        this.name = name;
        System.out.println("1 매개변수 생성자가 호출됩니다.");
    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("2 매개변수 생성자가 호출됩니다.");
    }
}

public class _01_Constructor {

    // 기본 생성자 호출
    Car c1 = new Car();

    // 매개변수 생성자 호출
    Car c2 = new Car("현대"); // 1 매개변수 생성자가 호출됩니다.
    Car c3 = new Car("현대", 3000);   // 2 매개변수 생성자가 호출됩니다.

}
