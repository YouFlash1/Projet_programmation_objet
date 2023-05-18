package Chat_Projet;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Bilan {
    private static final String FICHIER_TRANSACTION = "transactions.txt";

    public static void enregistrerTransaction(String typeTransaction, String codeProduit, int quantiteVendue, double prixVenteTotal) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FICHIER_TRANSACTION, true))) {
            writer.println(typeTransaction + ", " + codeProduit + ", " + quantiteVendue + ", " + prixVenteTotal);
        } catch (IOException e) {
            System.out.println("Erreur lors de l'enregistrement de la transaction : " + e.getMessage());
        }
    }
}
