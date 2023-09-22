/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chantalzimmerle
 */
public class TP1_stats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[6];
        System.out.println("Saisissez un nombre");
        int nombreLancers = sc.nextInt();
        
        
        Random generateurAleat = new Random();

        // Effectuer les lancers de dé et enregistrer les résultats
        for (int i = 0; i < nombreLancers; i++) {
            int resultatLancer = generateurAleat.nextInt(6); // Un nombre aléatoire entre 0 et 5
            tab[resultatLancer]++;
        }

        System.out.println("Résultats de la simulation :");

        // Afficher les résultats sous forme de pourcentages
        for (int i = 0; i < 6; i++) {
            double pourcentage = (double) tab[i] / nombreLancers * 100.0;
            System.out.println("Face " + (i + 1) + " : " + pourcentage + "%");
        }
    }
    
}
