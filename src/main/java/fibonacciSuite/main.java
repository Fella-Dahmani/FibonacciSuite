package fibonacciSuite;

import fibonacciSuite.CalculMethods;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // Asking user to put data

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de termes de la suite a calculer");
        int nbrTerme = sc.nextInt();

        // method instantiation
        CalculMethods calc = new CalculMethods();

        // Classic Methode
        long startingClassicTime =  System.nanoTime();
        calc.calculClassique(nbrTerme);
        long endingClassincTime = System.nanoTime();
        long classicMethodeTiming =endingClassincTime - startingClassicTime;
        System.out.println("Le temps de traitement de la methode classique en nanoseconds est:" +classicMethodeTiming);


        // Recursion Methode
        long startingRecursionTime =  System.nanoTime();
        for (int i = 0 ; i <= nbrTerme; i ++){
            System.out.println(calc.recursionCalcul(i));

        }
        long endingRecursionTime = System.nanoTime();
        long recursionMethodeTiming =endingRecursionTime - startingRecursionTime;
        System.out.println("Le temps de traitement de la methode recursive en nanoseconds est:"+recursionMethodeTiming);

        // Time Comparison
       /* if (classicMethodeTiming < recursionMethodeTiming){
            System.out.println("La methode la plus rapide est :"+"La Methode Classique");
        }
        else System.out.println("La methode la plus rapide est :"+"La Methode Recursive");
*/
       String best = ((classicMethodeTiming == recursionMethodeTiming) ? "Les deux methodes sont egaux" :(classicMethodeTiming < recursionMethodeTiming) ? "La methode la plus rapide est :La Methode Classique" : "La methode la plus rapide est :"+"La Methode Recursive" );
        System.out.println(best);



    }

    }

