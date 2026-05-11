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


    }
}