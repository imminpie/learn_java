package chap_02;

class Animal {
    public void makeSound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }
}

public class _05_MethodOverriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();    // 멍멍!
    }
}

