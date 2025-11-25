class Library {
    int availableBooks = 4;

    public void borrowBook(int booksRequested) {
        try {
            int[] books = {101, 102, 103, 104};
            System.out.println("Borrowing book..." + books[booksRequested]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred, you requested a book that does not exist.");
        } finally {
            System.out.println("Book Borrowed..." + booksRequested);
        }
    }
}

public class  LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();
        library.borrowBook(1);
    }
}
