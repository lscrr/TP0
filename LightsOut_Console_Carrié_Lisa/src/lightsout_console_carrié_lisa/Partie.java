/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsout_console_carrié_lisa;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lisa carrié
 */
public class Partie {
   Grille grilleLumière =new Grille();
   Random lumière = new Random();
   Scanner sc= new Scanner(System.in);
   
   public void initialiserPartie(){  // Pour initialiser la partie, il suffit d'allumer aléatoirement des lumières dans les cellules
       grilleLumière =new Grille();
       int x = lumière.nextInt(26);
       
      }
    public void débuterPartie(){
        while (grilleLumière.grilleGagnante()!=true){
          System.out.println("Selectionnez les coordonnées de la cellule dans laquelle vous souhaitez jouer");
        }
    }

 }
   //grg= rand.nextInt(26);
   
  