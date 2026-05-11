import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1. Générer un nombre aléatoire entre 1 et 100
        Random random = new Random();
        int nombreSecret = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int essaisRestants = 10;
        boolean aGagne = false;

        System.out.println("Bienvenue au jeu de devinettes !");
        System.out.println(" choisissez un nombre entre 1 et 100. Vous avez 10 essais.");

        // 2. Créer la boucle pour les 10 essais
        while (essaisRestants > 0) {
            System.out.print("\nEssais restants : " + essaisRestants + ". Devinez le nombre : ");
            int devinette = scanner.nextInt();

            // 3. Comparaison et indications
            if (devinette == nombreSecret) {
                System.out.println("Félicitations ! Tu as gagné !");
                aGagne = true;
                break; // Met fin à la boucle
            } else if (devinette > nombreSecret) {
                System.out.println("Le nombre est plus petit (inférieur).");
            } else {
                System.out.println("Le nombre est plus grand (supérieur).");
            }

            essaisRestants--;
        }

        // 4. Vérification de fin de partie
        if (!aGagne) {
            System.out.println("\nDommage, tu as perdu ! Le nombre était : " + nombreSecret);
        }

        scanner.close();
    }
}