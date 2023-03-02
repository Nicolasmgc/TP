package isep.app.TP1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prénom ?");
        String prenom = scanner.nextLine();
        int unEntier = scanner.nextInt();
        float unReel = scanner.nextFloat();
        System.out.println("Bonjour, " + prenom);
        System.out.println("J’ai recupere un entier: " + unEntier);
        System.out.println("J’ai aussi recupere un reel: " + unReel);
    }
    // Le résultat devrait être "J’ai recupere un entier: $ " "J’ai aussi recupere un reel: &" avec $ l'entier qu'aura saisie l'utilisateur et & le réel qu'aura saisie l'utilisateur
    // Il réceptionne les valeurs saisie par l'utilisateur, tout en vérifiant qu'il s'agit bien soit d'un réel ou un entier
    // Nous obtenons le résultat attendu


}

