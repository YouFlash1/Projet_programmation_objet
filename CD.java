package Chat_Projet;

class CD extends Produit {
    private int duree;
    private String titre;
    private String interprete;
    private int annee;
    private int nombreTitres;

    public CD(String code, double prixAchat) {
        super(code, prixAchat);
        this.duree = 0;
        this.titre = "Non disponible";
        this.interprete = "Non disponible";
        this.annee = 0;
        this.nombreTitres = 0;
    }

    public CD(String code, double prixAchat, int duree, String titre, String interprete, int annee, int nombreTitres) {
        super(code, prixAchat);
        this.duree = duree;
        this.titre = titre;
        this.interprete = interprete;
        this.annee = annee;
        this.nombreTitres = nombreTitres;
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

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getNombreTitres() {
        return nombreTitres;
    }

    public void setNombreTitres(int nombreTitres) {
        this.nombreTitres = nombreTitres;
    }

    @Override
    public void afficherDescription() {
        System.out.println("CD - Titre: " + titre + ", Interprète: " + interprete + ", Durée: " + duree + " minutes, Année: " + annee + ", Nombre de titres: " + nombreTitres);
    }

    @Override
    public double calculerPrixVente() {
        return getPrixAchat() * 1.5;
    }

    @Override
    public String toString() {
        return "CD - Code: " + getCode() + ", Titre: " + titre + ", Interprète: " + interprete + ", Durée: " + duree + " minutes, Année: " + annee +
                ", Nombre de titres: " + nombreTitres + ", Prix d'achat: " + getPrixAchat() + ", Quantité en stock: " + getQuantiteEnStock() + ", Description: " + getDescription();
    }
}
