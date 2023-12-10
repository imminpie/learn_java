package chap_02;

public class _01_Field {
    public static void main(String[] args) {
        // 인스턴스 필드 호출
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "홍길동";
        p1.address = "서울시";
        p1.isVip = true;

        p2.name = "죠죠";
        p2.address = "서울";
        p2.isVip = true;

        System.out.println(p1.address);
        System.out.println(p1.name);
        System.out.println(p1.isVip);

        System.out.println(p2.address);
        System.out.println(p2.name);
        System.out.println(p2.isVip);

        // 클래스 필드 호출
        System.out.println(Person.count);
    }
}

class Person {
    // 인스턴스 필드
    String name;
    String address;
    boolean isVip;

    // 클래스 필드
    static int count = 0;
}