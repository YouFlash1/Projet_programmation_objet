package Chat_Projet;

class Magazine extends Produit {
    private String titre;
    private String mois;
    private int annee;
    private String categorie;

    public Magazine(String code, double prixAchat) {
        super(code, prixAchat);
        this.titre = "Non disponible";
        this.mois = "Non disponible";
        this.annee = 0;
        this.categorie = "Non disponible";
    }

    public Magazine(String code, double prixAchat, String titre, String mois, int annee, String categorie) {
        super(code, prixAchat);
        this.titre = titre;
        this.mois = mois;
        this.annee = annee;
        this.categorie = categorie;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public void afficherDescription() {
        System.out.println("Magazine - Titre: " + titre + ", Mois: " + mois + ", Année: " + annee + ", Catégorie: " + categorie);
    }

    @Override
    public double calculerPrixVente() {
        return getPrixAchat() * 1.25;
    }

    @Override
    public String toString() {
        return "Magazine - Code: " + getCode() + ", Titre: " + titre + ", Mois: " + mois + ", Année: " + annee + ", Catégorie: " + categorie +
                ", Prix d'achat: " + getPrixAchat() + ", Quantité en stock: " + getQuantiteEnStock() + ", Description: " + getDescription();
    }
}
