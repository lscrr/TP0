/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertisseur_carriélisa;

import java.util.Scanner;

/**
 *TDA
 * TP1-2
 * @author CArrié Lisa
 * 4/10/2021
 */
public class Convertisseur_CarriéLisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        double temperatureC;
        System.out.println("Entrer une température en Celcius");
        temperatureC = sc.nextFloat();  
        /*double temperatureK;
        temperatureK = temperatureC + 273.15;
        System.out.println("La température en Kelvin est " + temperatureK); */
        double res= CelciusVersKelvin(temperatureC);
        System.out.println("La température en Kelvin est " +res);
    }
    public static double CelciusVersKelvin (double temperatureC){
        double tempsKelvin= (double)(temperatureC + 273.15); 
        return tempsKelvin;
    }
    public static double KelvinVersCelcius (double temperatureK){
        double temperatureC= (double)(temperatureK - 273.15);
        return temperatureK;
    }
  
    

}
