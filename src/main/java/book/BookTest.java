package book;

public class BookTest {
    public static void main(String[] args) {
        Book myBook = new Book(1, "how to java", 100);
        SpecialEditionBook mySpecialBook = new SpecialEditionBook(2, "how to advanced java", 200, 40);

        myBook.disp();
        mySpecialBook.display();

    }
}
