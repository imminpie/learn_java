package chap_03;

interface TV {
    void turnOn();
    void turnOff();
}

class LedTV implements TV {

    @Override
    public void turnOn() {
        System.out.println("켜다");
    }

    @Override
    public void turnOff() {
        System.out.println("끄다");
    }

}

public class _07_Interface {
    public static void main(String[] args) {
        TV tv = new LedTV();
        tv.turnOn();
        tv.turnOff();
    }
}
