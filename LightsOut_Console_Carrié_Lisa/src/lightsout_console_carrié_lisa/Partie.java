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

    Grille grilleLumière = new Grille();
    Random lumière = new Random();

    public void initialiserPartie() {  // Pour initialiser la partie, il suffit d'allumer aléatoirement des lumières dans les cellules
        
        grilleLumière = new Grille(); // on met en place une grille dans laquelle le joueur pourra jouer
        int x = lumière.nextInt(26);  // on y place aléatoirement (à l'aide de random) des lumières
        //grilleLumière.
    }

    public void débuterPartie() {
        
        int lig;
        int col;
        
        while (grilleLumière.grilleGagnante() != true) { // tant  que la grille n'est pas gagnante alors
            
            grilleLumière.afficherGrilleSurConsole(); // on affiche la grille sur l'écran
            
            Scanner sc2 = new Scanner(System.in); // on s'aide d'un scanner pour prendre en compte les choix de selections de cellules du joueur
            
            System.out.println("Selectionner la ligne dans laquelle vous souhaitez jouer"); // puis on lui demande de choisir une ligne
            lig = sc2.nextInt();
            
            Scanner sc1 = new Scanner(System.in);
             
            System.out.println("Selectionnez la colonne dans laquelle vous souhaitez jouer"); // ainsi qu'une colonne 
            col = sc1.nextInt();
            
           // if (grilleLumière.CellulesLumineuses[lig][col].étatCellule()== true){    // si la cellule selectionnée par le joueur est allumée 
                grilleLumière.CellulesLumineuses[lig][col].changerEtat();            // alors on change l'état de la cellule 
                grilleLumière.présenceDeLumière(lig, col);          // et on change les états des cellules voisines (au plus 4)
                
                
            }//grilleLumière.grilleGagnante()== false;
        System.out.println("Féliciations vous avez gagné!");
            }
            
            }
        

    
    //grg= rand.nextInt(26);

