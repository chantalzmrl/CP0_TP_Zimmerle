/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur;

import java.util.Scanner;

/**
 *
 * @author chantalzimmerle
 */
public class TP1_convertisseur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Veuillez saisir une valeur :");
        
        double temperature = sc.nextDouble();

         System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");
        
         int choice = sc.nextInt();
         
         switch (choice) {
            case 1:
                double kelvin = CelciusVersKelvin(temperature);
                System.out.println(temperature + " degré Celsius est égal à " + kelvin + " degré Kelvin.");
                break;
            case 2:
                double celcius = KelvinVersCelcius(temperature);
                System.out.println(temperature + " degré Kelvin est égal à " + celcius + " degré Celsius.");
                break;
            case 3:
                double celciusToFahrenheit = CelciusVersFarenheit(temperature);
                System.out.println(temperature + " degré Celsius est égal à " + celciusToFahrenheit + " degré Fahrenheit.");
                break;
            case 4:
                double fahrenheitToCelcius = FarenheitVersCelcius(temperature);
                System.out.println(temperature + " degré Fahrenheit est égal à " + fahrenheitToCelcius + " degré Celsius.");
                break;
            case 5:
                double kelvinToFahrenheit = KelvinVersFarenheit(temperature);
                System.out.println(temperature + " degré Kelvin est égal à " + kelvinToFahrenheit + " degré Fahrenheit.");
                break;
            case 6:
                double fahrenheitToKelvin = FarenheitVersKelvin(temperature);
                System.out.println(temperature + " degré Fahrenheit est égal à " + fahrenheitToKelvin + " degré Kelvin.");
                break;
            default:
                System.out.println("Choix invalide.");
        }
                
    }
    
     public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    public static double FarenheitVersCelcius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5 / 9;
    }

    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9 / 5) + 32;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        double celcius = KelvinVersCelcius(tKelvin);
        return CelciusVersFarenheit(celcius);
    }

    public static double FarenheitVersKelvin(double tFahrenheit) {
        double celcius = FarenheitVersCelcius(tFahrenheit);
        return CelciusVersKelvin(celcius);
    }
    
}
