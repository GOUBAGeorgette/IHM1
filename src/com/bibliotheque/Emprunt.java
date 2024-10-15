import java.util.Date;

public class Emprunt {
    private Livre livre;
    private Utilisateur utilisateur;
    private Date dateEmprunt;
    private Date dateRetour;

    public Emprunt(Livre livre, Utilisateur utilisateur, Date dateEmprunt) {
        this.livre = livre;
        this.utilisateur = utilisateur;
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = null; // Initialement, il n'y a pas de date de retour
    }

    // Getters et Setters
    public Livre getLivre() {
        return livre;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }
}
