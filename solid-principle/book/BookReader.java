import java.util.List;

public class BookReader {
    public static void main(String[] args) {
        IPrintToScreen book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToScreen();
    }
}