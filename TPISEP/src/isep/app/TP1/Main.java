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
        somme();
        division();
        volume();
    }
    // Le résultat devrait être "J’ai recupere un entier: $ " "J’ai aussi recupere un reel: &" avec $ l'entier qu'aura saisie l'utilisateur et & le réel qu'aura saisie l'utilisateur
    // Il réceptionne les valeurs saisie par l'utilisateur, tout en vérifiant qu'il s'agit bien soit d'un réel ou un entier
    // Nous obtenons le résultat attendu

    public static void somme(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier +
                " est egale a " + somme);


    }

    public static void division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxième entier");
        int deuxièmeEntier = scanner.nextInt();
        double division = premierEntier/deuxièmeEntier;
        System.out.println("La division de " + premierEntier + " par " + deuxièmeEntier + " est égale à " + division);

    }

    //Pour le volume :
    // Nous avons besoin de 3 variables, une pour la hauteur, largeur et longueur.
    // Ce sont des doubles
    // Nous pouvons demandés à l'utilisateur des les saisirs lui même
    // V = L * l * h
    //Nous pouvons renvoyer ce résultat à l'utilisateur

    public static void volume(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la hauteur");
        double hauteur = scanner.nextDouble();
        System.out.println("Veuillez saisir la longueur");
        double longueur  = scanner.nextDouble();
        System.out.println("Veuillez saisir la largeur");
        double largeur = scanner.nextDouble();
        double volume = hauteur*longueur*largeur;
        System.out.println("Le volume de votre pavé est de : " + volume);
    }




}

