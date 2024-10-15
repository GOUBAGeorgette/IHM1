import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    // Déclaration de la carte des utilisateurs
    private static Map<String, String> users = new HashMap<>();

    static {
        users.put("admin", "admin"); // Bibliothécaire
        users.put("student", "student123"); // Étudiant
    }

    public LoginFrame() {
        // Configuration de la fenêtre de connexion
        setTitle("Connexion");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Création des champs de texte et bouton
        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Se connecter");

        // Ajout d'un écouteur d'événements au bouton de connexion
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login(); // Appel de la méthode de connexion
            }
        });

        // Mise en page
        JPanel panel = new JPanel();
        panel.add(new JLabel("Nom d'utilisateur:"));
        panel.add(usernameField);
        panel.add(new JLabel("Mot de passe:"));
        panel.add(passwordField);
        panel.add(loginButton);
        add(panel);

        setVisible(true);
    }

    // Méthode de connexion
    private void login() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        System.out.println("Tentative de connexion : " + username + ", mot de passe : " + password);

        if (users.containsKey(username) && users.get(username).equals(password)) {
            new DashboardFrame(users.get(username).equals("admin") ? "bibliothécaire" : "étudiant");
            dispose(); // Ferme la fenêtre de connexion
        } else {
            JOptionPane.showMessageDialog(this, "Nom d'utilisateur ou mot de passe incorrect !");
        }
    }
}
