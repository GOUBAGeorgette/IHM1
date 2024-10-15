import java.util.HashMap;
import java.util.Map;

public class BorrowingManager {
    private Map<Book, String> borrowedBooks; // Livre et emprunteur

    public BorrowingManager() {
        borrowedBooks = new HashMap<>();
    }

    // Méthode pour emprunter un livre
    public boolean borrowBook(Book book, String borrower) {
        if (book.isAvailable()) {
            book.setAvailable(false); // Le livre n'est plus disponible
            borrowedBooks.put(book, borrower); // Enregistrer l'emprunteur
            return true;
        }
        return false; // Le livre n'est pas disponible
    }

    // Méthode pour retourner un livre
    public boolean returnBook(Book book) {
        if (borrowedBooks.containsKey(book)) {
            book.setAvailable(true); // Le livre redevient disponible
            borrowedBooks.remove(book); // Retirer l'emprunteur
            return true;
        }
        return false; // Le livre n'est pas emprunté
    }
}
