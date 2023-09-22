/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_zimmerle;

/**
 *
 * @author chantalzimmerle
 */
public class BouteilleBiere {
    String nom ;
    double degreAlcool ; 
    String  brasserie ; 
    boolean ouverte;
    
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie, boolean Décapsuler) {
   nom = unNom;
   degreAlcool = unDegre;
   brasserie = uneBrasserie;
   ouverte = false;
}
    
 public void lireEtiquette(){
     System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres) \nBrasserie : " + brasserie );
 }
}
