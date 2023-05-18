package Chat_Projet;

class DVD extends Produit {
    private int duree;
    private String titre;
    private String realisateur;
    private int annee;

    public DVD(String code, double prixAchat) {
        super(code, prixAchat);
        this.duree = 0;
        this.titre = "Non disponible";
        this.realisateur = "Non disponible";
        this.annee = 0;
    }

    public DVD(String code, double prixAchat, int duree, String titre, String realisateur, int annee) {
        super(code, prixAchat);
        this.duree = duree;
        this.titre = titre;
        this.realisateur = realisateur;
        this.annee = annee;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public void afficherDescription() {
        System.out.println("DVD - Titre: " + titre + ", Réalisateur: " + realisateur + ", Durée: " + duree + " minutes, Année: " + annee);
    }

    @Override
    public double calculerPrixVente() {
        return getPrixAchat() * 1.5;
    }

    @Override
    public String toString() {
        return "DVD - Code: " + getCode() + ", Titre: " + titre + ", Réalisateur: " + realisateur + ", Durée: " + duree + " minutes, Année: " + annee +
                ", Prix d'achat: " + getPrixAchat() + ", Quantité en stock: " + getQuantiteEnStock() + ", Description: " + getDescription();
    }
}
