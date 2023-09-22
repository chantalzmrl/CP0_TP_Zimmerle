/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint;

import java.util.Scanner;

/**
 *
 * @author chantalzimmerle
 */
public class TP1_manipNombresInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
      int nb1; // nombre d'entiers à additionner  
      int nb2;
      int sum;
      int diff;
      int produit;
      int reste; 
      int quotient;
        
   
   
Scanner sc = new Scanner(System.in);
System.out.println("Entrer le nombre :");
nb1=sc.nextInt();


System.out.println("Entrer le nombre :");
nb2=sc.nextInt();
 


// addition des nb premiers entiers
sum = nb1 + nb2; 
diff = nb1 - nb2;
produit = nb1 * nb2; 
reste = nb1 % nb2; 
quotient = nb1 / nb2; 



// affichage du resultat

System.out.println("la somme est égale à "+ sum + " la diff est " + diff + " le produit est "+ produit + " le quotient est " + quotient + " le reste est " + reste); 


    }
    
}
