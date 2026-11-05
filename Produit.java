import java.util.Scanner;

public class Produit {
    private String reference;
    private String designation;
    private double prixHT;
    private int quantiteStock;

    public Produit(String reference, String designation, double prixHT, int quantiteStock) {
        this.reference = reference;
        this.designation = designation;
        this.prixHT = prixHT;
        this.quantiteStock = quantiteStock;
    }

    // Getters and Setters
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public void afficher() {
        System.out.println("Reference: " + reference);
        System.out.println("Designation: " + designation);
        System.out.println("PrixHT: " + prixHT);
        System.out.println("QuantiteStock: " + quantiteStock);
    }

    public double calculerValeurStock() {
        return prixHT * quantiteStock;
    }

    public void appliquerRemise(double pourcentage) {
        if (pourcentage > 0 && pourcentage <= 100) {
            prixHT -= prixHT * (pourcentage / 100);
        } else {
            System.out.println("Pourcentage de remise invalide.");
        }
    }
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez la référence du produit: ");
        String reference = clavier.nextLine();

        System.out.print("Entrez la désignation du produit: ");
        String designation = clavier.nextLine();

        System.out.print("Entrez le prix HT du produit: ");
        double prixHT = clavier.nextDouble();

        System.out.print("Entrez la quantité en stock du produit: ");
        int quantiteStock = clavier.nextInt();

        Produit produit = new Produit(reference, designation, prixHT, quantiteStock);

        int choix;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1- Afficher les informations du produit");
            System.out.println("2- Calculer la valeur totale du stock");
            System.out.println("3- Appliquer une remise sur le produit");
            System.out.println("4- Quitter");
            System.out.print("Votre choix: ");

            choix = clavier.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("--- Informations du produit ---");
                    produit.afficher();
                    break;
                case 2:
                    double valeurStock = produit.calculerValeurStock();
                    System.out.println("Valeur totale du stock: " + valeurStock);
                    break;
                case 3:
                    System.out.print("Entrez le pourcentage de remise à appliquer: ");
                    double pourcentageRemise = clavier.nextDouble();
                    produit.appliquerRemise(pourcentageRemise);
                    System.out.println("--- Informations après remise ---");
                    produit.afficher();
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide");
            }
        } while (choix != 4);

        clavier.close();
    }
}
