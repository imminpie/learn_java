package chap_02;

public class _02_Methods {
    public static void main(String[] args) {
        // 클래스 메소드 호출
        VendingMachine.printVersion();

        // 인스턴스 메소드 호출
        VendingMachine v1 = new VendingMachine();
        v1.pushProductButton(100);
    }
}

class VendingMachine {
    // 인스턴스 메소드
    public String pushProductButton(int menuId) {
        System.out.println(menuId + "를 전달 받았습니다.");
        return "콜라";
    }

    // static 메소드 (클래스 메소드)
    public static void printVersion() {
        System.out.println("v1.0");
    }
}
