package chap_04;

class GenericBox<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

class GenericClassBox {
    public static <T> void printArray(T[] array) {
        for (T data : array) {
            System.out.println(data);
        }
    }
}

public class _02_Generic {
    public static void main(String[] args) {

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setT("문자열박스");
        String stringValue = stringBox.getT();
        System.out.println(stringValue);

        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.setT(2000);
        int intValue = integerBox.getT();
        System.out.println(intValue);

        String[] stringArray = {"A", "B", "C"};
        GenericClassBox.printArray(stringArray);

        Integer[] integerArray = {1, 2, 3};
        GenericClassBox.printArray(integerArray);

    }
}
