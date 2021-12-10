/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsout_console_carrié_lisa;

/**
 *
 * @author lisa carrié
 */
public class Grille {
    Cellule [][] Lumière = new Cellule [5][5];
   // boolean état;
    
    public void afficherGrilleSurConsole(){
        for (int i =0; i<5 ; i++){
            for (int j=0; j<5; j++){
                System.out.print(" " +Lumière [i][j].lumière + " ");
            }System.out.println();
        }
    }
    
    public 
}
