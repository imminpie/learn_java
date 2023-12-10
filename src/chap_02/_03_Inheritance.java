package chap_02;


class Car {
    public void run() {
        System.out.println("달리다");
    }
}

class Bus extends Car {
}

public class _03_Inheritance {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.run();
    }
}