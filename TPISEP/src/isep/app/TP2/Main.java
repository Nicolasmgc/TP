package isep.app.TP2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        discriminant();

    }

    public static void nomFonction() {
// Contenu de la fonction
    }


    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        double racine;
        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle");
            System.out.println("La première racine est : " + -b + " + i * " + Math.sqrt(-delta) + "/" + 2 * a);
            System.out.println("La deuxième racine est : " + -b + " - i * " + Math.sqrt(-delta) + "/" + 2 * a);
        }
        if (delta == 0) {
            racine = -b / 2 * a ;
            System.out.println("La racine unique est : " + racine);
        }
        if(delta>0){
            racine = -b + Math.sqrt(b)/2 * a ;
            System.out.println("La première racine est : " + racine);
            racine = -b - Math.sqrt(b)/2 * a ;
            System.out.println("La deuxième racine est : " + racine);
        }
    }
}

