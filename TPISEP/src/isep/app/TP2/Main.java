package isep.app.TP2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //discriminant();
        //parite();
        //max();
        //min();
        //egaliteStr();
        factorielle();
        countdown();
        carres();

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
        else if (delta == 0) {
            racine = -b / 2 * a ;
            System.out.println("La racine unique est : " + racine);
        }
        else {
            racine = -b + Math.sqrt(b)/2 * a ;
            System.out.println("La première racine est : " + racine);
            racine = -b - Math.sqrt(b)/2 * a ;
            System.out.println("La deuxième racine est : " + racine);
        }
    }


    public static void parite(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez rentrer un entier : ");
        int unEntier = scanner.nextInt();
        if (unEntier % 2 == 0){
            System.out.println("Le chiffre "+ unEntier + " est pair ! ");
        }
        else {
            System.out.println("Le chiffre "+ unEntier + "est impair !");
        }
    }

    public static void max(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Veuillez saisir un premier entier : ");
            int preEntier = scanner.nextInt();
            System.out.println("Veuillez saisir un deuxième entier : ");
            int deuEntier = scanner.nextInt();
            int max = Math.max(preEntier, deuEntier);
            System.out.println("L'entier le plus grand est : " + max);
    }

    public static void min(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un premier entier : ");
        int preEntier = scanner.nextInt();
        System.out.println("Veuillez saisir un deuxième entier : ");
        int deuEntier = scanner.nextInt();
        int min = Math.min(preEntier,deuEntier);
        System.out.println("L'entier le plus petit est : " + min);

    }

    public static void egaliteStr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez une première chaine de charactère : ");
        String preStr = scanner.nextLine();
        System.out.println("Saisissez une deuxième chaine de charactère : ");
        String deuStr = scanner.nextLine();
        if (preStr.equals(deuStr)){
            System.out.println("Ces deux chaines de charactères sont identiques");
        }
        else {
            System.out.println("Ces deux chaines de charactères ne sont pas identiques");
        }
    }

    public static void factorielle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        if (n == 0 ){
            System.out.println(n + "! = 1");
        }
        else {
            for (int i = 0; i <= n; i++) {
                factorielle *= i + 1;

            }
            System.out.println(n + "! = " + factorielle);
        }
    }
    public static void countdown(){
        for(int i = 10; i >= 0; i --){
            System.out.println(i);
        }
        System.out.println("BOOM");
    }

    public static void carres(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier");
        int x = scanner.nextInt();
        System.out.println(x + "    " + x * x);
    }

}



