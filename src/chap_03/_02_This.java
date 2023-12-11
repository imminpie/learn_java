package chap_03;

class Animal {
    private String name = "멍멍이";

    public void introduce(String name) {
        System.out.println(this.name); // 멍멍이
        System.out.println(name);   // 바둑이

        this.name = name;
        System.out.println(this.name);  // 바둑이
        System.out.println(name);   // 바둑이
    }
}

public class _02_This {
    public static void main(String[] args) {

        Animal dog = new Animal();
        dog.introduce("바둑이");

    }
}
