package chap_04;

class BookList {
    private String title;
    private int price;

    public BookList(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
}

public class _01_Array {
    public static void main(String[] args) {

        int[] Numbers = {1, 2, 3, 4, 5};

        // for each
        for (int num : Numbers) {
            System.out.println(num);
        }

        BookList[] list = new BookList[2];
        list[0] = new BookList("Java", 35000);
        list[1] = new BookList("Spring", 28000);

        // for each
        for (BookList book : list) {
            System.out.println(book.getTitle() + ", " + book.getPrice());
        }

    }
}
