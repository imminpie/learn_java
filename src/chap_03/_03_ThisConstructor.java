package chap_03;

class Book {
    private String name;
    private String category;
    private int price;

    public Book() {
        this("Spring", 35000);
    }

    public Book(String name, int price) {
        this("Java", "IT", 28000);
        this.name = name;
        this.price = price;
        System.out.println(this.name + ", " + this.price);
        // Spring,35000
    }

    public Book(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
        System.out.println(this.name + ", " + this.category + ", " + this.price);
        // Java, IT, 28000
    }
}

public class _03_ThisConstructor {
    public static void main(String[] args) {
        Book book = new Book();
    }
}
