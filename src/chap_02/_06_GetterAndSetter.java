package chap_02;

class Book {
    private String title;
    private int price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class _06_GetterAndSetter {
    public static void main(String[] args) {
        Book book = new Book();

        book.setTitle("즐거운 자바");
        book.setPrice(5000);

        book.getTitle();
        book.getPrice();
    }
}
