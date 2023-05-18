package Chat_Projet;

class JeuDeSociete extends Produit {
    private String nom;
    private int nombreMaxJoueurs;
    private String theme;
    private String niveau;

    public JeuDeSociete(String code, double prixAchat) {
        super(code, prixAchat);
        this.nom = "Non disponible";
        this.nombreMaxJoueurs = 0;
        this.theme = "Non disponible";
        this.niveau = "Non disponible";
    }

    public JeuDeSociete(String code, double prixAchat, String nom, int nombreMaxJoueurs, String theme, String niveau) {
        super(code, prixAchat);
        this.nom = nom;
        this.nombreMaxJoueurs = nombreMaxJoueurs;
        this.theme = theme;
        this.niveau = niveau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreMaxJoueurs() {
        return nombreMaxJoueurs;
    }

    public void setNombreMaxJoueurs(int nombreMaxJoueurs) {
        this.nombreMaxJoueurs = nombreMaxJoueurs;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    @Override
    public void afficherDescription() {
        System.out.println("Jeu de société - Nom: " + nom + ", Nombre max de joueurs: " + nombreMaxJoueurs +
                ", Thème: " + theme + ", Niveau: " + niveau);
    }

    @Override
    public double calculerPrixVente() {
        return getPrixAchat() * 2.0;
    }

    @Override
    public String toString() {
        return "Jeu de société - Code: " + getCode() + ", Nom: " + nom + ", Nombre max de joueurs: " + nombreMaxJoueurs +
                ", Thème: " + theme + ", Niveau: " + niveau + ", Prix d'achat: " + getPrixAchat() +
                ", Quantité en stock: " + getQuantiteEnStock() + ", Description: " + getDescription();
    }
}
