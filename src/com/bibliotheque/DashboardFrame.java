import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class DashboardFrame extends JFrame {
    private BorrowingManager borrowingManager;
    private JComboBox<Book> bookComboBox; // Pour sélectionner un livre

    public DashboardFrame(String userType) {
        borrowingManager = new BorrowingManager();
        setTitle("Tableau de bord " + userType);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Exemple de livres
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("Le Petit Prince", "Antoine de Saint-Exupéry");

        // Ajout des livres à la liste déroulante
        bookComboBox = new JComboBox<>(new Book[]{book1, book2});

        JButton borrowButton = new JButton("Emprunter");
        JButton returnButton = new JButton("Retourner");

        // Événements pour les boutons
        borrowButton.addActionListener(e -> {
            Book selectedBook = (Book) bookComboBox.getSelectedItem();
            if (borrowingManager.borrowBook(selectedBook, "Nom d'utilisateur")) {
                JOptionPane.showMessageDialog(this, "Livre emprunté avec succès !");
            } else {
                JOptionPane.showMessageDialog(this, "Livre non disponible !");
            }
        });

        returnButton.addActionListener(e -> {
            Book selectedBook = (Book) bookComboBox.getSelectedItem();
            if (borrowingManager.returnBook(selectedBook)) {
                JOptionPane.showMessageDialog(this, "Livre retourné avec succès !");
            } else {
                JOptionPane.showMessageDialog(this, "Ce livre n'est pas emprunté !");
            }
        });

        // Mise en page
        JPanel panel = new JPanel();
        panel.add(bookComboBox);
        panel.add(borrowButton);
        panel.add(returnButton);
        add(panel);

        setVisible(true);
    }
}
