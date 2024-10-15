public class Livre {
    private String titre;
    private String auteur;
    private int anneePublication;
    private boolean disponible;

    public Livre(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.disponible = true; // Le livre est disponible à l'ajout
    }

    // Getters et Setters
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return titre + " par " + auteur + " (" + anneePublication + ")";
    }
}
