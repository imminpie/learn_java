package chap_03;

class Car1 {
    public Car1() {
        System.out.println("Car 의 기본 생성자");
    }
}

class Truck extends Car1 {
    public Truck() {
        System.out.println("Truck 의 기본 생성자");
    }
}

public class _04_SuperExam1 {
    public static void main(String[] args) {
        Truck truck = new Truck();
        // Car 의 기본 생성자
        // Truck 의 기본 생성자
    }
}
