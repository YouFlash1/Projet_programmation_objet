package Chat_Projet;

class Livre extends Produit {
    private String titre;
    private String auteur;
    private int annee;
    private String editeur;

    public Livre(String code, double prixAchat, String titre, String auteur, int annee, String editeur) {
        super(code, prixAchat);
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        this.editeur = editeur;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getAnnee() {
        return annee;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    @Override
    public void afficherDescription() {
        System.out.println("Livre - Titre: " + titre + ", Auteur: " + auteur + ", Année: " + annee + ", Éditeur: " + editeur);
    }

    @Override
    public double calculerPrixVente() {
        return getPrixAchat() * 1.75;
    }

    @Override
    public String toString() {
        return "Livre - Code: " + getCode() + ", Titre: " + titre + ", Auteur: " + auteur + ", Année: " + annee + ", Éditeur: " + editeur +
                ", Prix d'achat: " + getPrixAchat() + ", Quantité en stock: " + getQuantiteEnStock() + ", Description: " + getDescription();
    }
}

