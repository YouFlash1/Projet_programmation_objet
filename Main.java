package Chat_Projet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Librairie librairie = new Librairie("Ma Librairie", 1000.0);
        Scanner scanner = new Scanner(System.in);

        int choix;
        do {
            afficherMenu();
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer le saut de ligne

            switch (choix) {
                case 1:
                    saisirProduitsDepuisFichier(librairie);
                    break;
                case 2:
                    ajouterProduit(librairie, scanner);
                    break;
                case 3:
                    retirerProduit(librairie, scanner);
                    break;
                case 4:
                    traiterVentes(librairie, scanner);
                    break;
                case 5:
                    rechercherProduit(librairie, scanner);
                    break;
                case 6:
                    consulterSolde(librairie);
                    break;
                case 7:
                    quitterApplication();
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 7);

        scanner.close();
    }

    private static void afficherMenu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Saisir les produits en stock depuis un fichier");
        System.out.println("2. Ajouter un nouveau produit");
        System.out.println("3. Retirer un produit");
        System.out.println("4. Traiter des ventes");
        System.out.println("5. Rechercher un produit");
        System.out.println("6. Consulter le solde");
        System.out.println("7. Quitter l'application");
        System.out.print("Choix : ");
    }

    private static void saisirProduitsDepuisFichier(Librairie librairie) {
        // Code pour lire le fichier et ajouter les produits à la librairie
        System.out.println("Saisie des produits depuis un fichier");
    }

    private static void ajouterProduit(Librairie librairie, Scanner scanner) {
        System.out.println("Ajouter un nouveau produit");

        // Saisir les informations du produit
        System.out.print("Code : ");
        String code = scanner.nextLine();
        System.out.print("Prix d'achat : ");
        double prixAchat = scanner.nextDouble();
        scanner.nextLine(); // Consommer le saut de ligne

        // Créer un produit générique
        Produit produit = new Produit(code, prixAchat);

        // Ajouter le produit à la librairie
        librairie.ajouterProduit(produit);

        System.out.println("Le produit a été ajouté avec succès.");
    }

    private static void retirerProduit(Librairie librairie, Scanner scanner) {
        System.out.println("Retirer un produit");

        // Saisir le code du produit à retirer
        System.out.print("Code du produit : ");
        String code = scanner.nextLine();

        // Retirer le produit de la librairie
        librairie.retirerProduit(code);

        System.out.println("Le produit a été retiré avec succès.");
    }

    private static void traiterVentes(Librairie librairie, Scanner scanner) {
        System.out.println("Traiter des ventes");

        // Saisir le code du produit à vendre
        System.out.print("Code du produit : ");
        String code = scanner.nextLine();

        // Saisir la quantité à vendre
        System.out.print("Quantité : ");
        int quantite = scanner.nextInt();
        scanner.nextLine(); // Consommer le saut de ligne

        // Vendre le produit
        boolean venteEffectuee = librairie.vendreProduit(code, quantite);

        if (venteEffectuee) {
            System.out.println("La vente a été effectuée avec succès.");
        } else {
            System.out.println("Impossible de vendre le produit. Stock insuffisant.");
        }
    }

    private static void rechercherProduit(Librairie librairie, Scanner scanner) {
        System.out.println("Rechercher un produit");

        // Saisir le code du produit à rechercher
        System.out.print("Code du produit : ");
        String code = scanner.nextLine();

        // Rechercher le produit dans la librairie
        Produit produit = librairie.rechercherProduit(code);

        if (produit != null) {
            System.out.println("Produit trouvé :");
            System.out.println(produit);
        } else {
            System.out.println("Produit non trouvé.");
        }
    }

    private static void consulterSolde(Librairie librairie) {
        System.out.println("Le solde de la librairie est de : " + librairie.getSolde() + " €");
    }

    private static void quitterApplication() {
        System.out.println("Merci d'avoir utilisé notre application. Au revoir !");
    }
}
