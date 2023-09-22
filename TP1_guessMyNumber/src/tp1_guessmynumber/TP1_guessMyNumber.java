/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chantalzimmerle
 */
public class TP1_guessMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
         Scanner sc = new Scanner(System.in);
         System.out.println("Saisissez un nombre entre 0 et 100");
          int a = sc.nextInt();
         
       
        Random generateurAleat = new Random();
            
        int n = generateurAleat.nextInt(100);
        
      
      
      
      while (a != n) {
      
      
      if (a < n){
         System.out.println("Le chiffre est trop petit");
         
      }
      
      else if( a > n){
          System.out.println("Le chiffre est trop grand");
      }
     a = sc.nextInt();
      
        
      }
      
      System.out.println("Bravo !!! ");
    }
    
}
