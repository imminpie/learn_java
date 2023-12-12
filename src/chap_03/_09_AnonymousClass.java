package chap_03;

public class _09_AnonymousClass {
    public static void main(String[] args) {

        Bird duck = new Bird() {
            @Override
            public void sing() {
                System.out.println("꽥꽥!");
            }
        };

        duck.sing();

    }
}
