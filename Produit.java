package Chat_Projet;

class Produit {
    private String code;
    private double prixAchat;
    private int quantiteEnStock;
    private String description;

    public Produit(String code, double prixAchat) {
        this.code = code;
        this.prixAchat = prixAchat;
        this.quantiteEnStock = 0;
        this.description = "Non disponible";
    }

    public String getCode() {
        return code;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }

    public void setQuantiteEnStock(int quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void afficherDescription() {
        System.out.println("Description: " + description);
    }

    public void diminuerStock(int quantite) {
        if (quantiteEnStock >= quantite) {
            quantiteEnStock -= quantite;
        } else {
            System.out.println("Quantité insuffisante en stock.");
        }
    }

    public double calculerPrixVente() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Prix d'achat: " + prixAchat + ", Quantité en stock: " + quantiteEnStock +
                ", Description: " + description;
    }
}

