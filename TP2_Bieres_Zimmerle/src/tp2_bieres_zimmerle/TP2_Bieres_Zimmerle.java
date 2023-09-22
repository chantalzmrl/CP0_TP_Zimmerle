/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_zimmerle;

/**
 *
 * @author chantalzimmerle
 */
public class TP2_Bieres_Zimmerle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0, "Les trolls");
        
        uneBiere.lireEtiquette();
        
        BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe", (float)6.6, "Abbaye de Leffe");
        
        deuxiemeBiere.lireEtiquette();
        
        
       
        
    }
    
}
