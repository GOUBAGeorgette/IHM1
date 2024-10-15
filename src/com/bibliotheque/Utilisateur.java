public class Utilisateur {
    private String nom;
    private String motDePasse;
    private String type; // "bibliothécaire" ou "étudiant"

    public Utilisateur(String nom, String motDePasse, String type) {
        this.nom = nom;
        this.motDePasse = motDePasse;
        this.type = type;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public boolean estBibliothecaire() {
        return type.equals("bibliothécaire");
    }
}
