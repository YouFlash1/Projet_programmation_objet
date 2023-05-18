package Chat_Projet;

import java.util.ArrayList;

class Librairie {
    private String nom;
    private double solde;
    private ArrayList<Produit> stock;

    public Librairie(String nom, double solde) {
        this.nom = nom;
        this.solde = solde;
        this.stock = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public ArrayList<Produit> getStock() {
        return stock;
    }

    public void ajouterProduit(Produit produit) {
        stock.add(produit);
    }

    public void retirerProduit(String code) {
        for (Produit produit : stock) {
            if (produit.getCode().equals(code)) {
                stock.remove(produit);
                break;
            }
        }
    }

    public boolean vendreProduit(String code, int quantite) {
    	for (Produit produit : stock) {
            if (produit.getCode().equals(code)) {
                if (produit.getQuantiteEnStock() >= quantite) {
                    produit.diminuerStock(quantite);
                    double prixVente = produit.calculerPrixVente() * quantite;
                    solde += prixVente;
                    System.out.println("Vente effectuée. Montant total: " + prixVente);
                } else {
                    System.out.println("Quantité insuffisante en stock pour la vente.");
                }
                
            }
        }
    	System.out.println("Produit non trouvé dans le stock.");
        return true;
       
    }

    public Produit rechercherProduit(String code) {
        for (Produit produit : stock) {
            if (produit.getCode().equals(code)) {
                return produit;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Librairie: " + nom + ", Solde: " + solde + ", Stock: " + stock.size() + " produits";
    }
}
