package chap_03;

class Animal1 {
    private String name;
    private int age;

    public Animal1() {
        System.out.println("Animal 기본 생성자 호출");
    }

    public Animal1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Dog extends Animal1 {
    private String sound;

    public Dog() {
        super();
        // Animal 기본 생성자 호출
    }

    public Dog(String name, int age, String sound) {
        super(name, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}

public class _05_SuperExam2 {
    public static void main(String[] args) {

        Dog d1 = new Dog(); // Animal 기본 생성자 호출

        Dog d2 = new Dog("멍멍이", 3, "멍멍!");
        System.out.println(d2.getName());
        System.out.println(d2.getAge());
        System.out.println(d2.getSound());

    }
}
