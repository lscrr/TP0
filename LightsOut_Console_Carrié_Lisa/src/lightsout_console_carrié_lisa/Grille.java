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
    
    Cellule [][] CellulesLumineuses = new Cellule [5][5];    // on crée les cellules

    
    public void afficherGrilleSurConsole(){
        
        for (int i =0; i<5 ; i++){
            for (int j=0; j<5; j++){
                System.out.print(" " +CellulesLumineuses [i][j].état + " ");
            }System.out.println();
        }
    }
    public boolean grilleGagnante(){    // la grille est gagnante si elle est totalement éteinte 
        
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (CellulesLumineuses[i][j].étatCellule()== true){   // si l'une des cellules est allumée alors la grille n'est pas gagnante
                return false;   
            }
        }
        }
        return true;      // sinon elle est gagnante
    }
    
    public void présenceDeLumière(int i, int j){
        
        if (i>0 && i<4 && j>0 && j<4){                   // centre de la grille: on change l'état de la cellule une fois les coordonées du joueur sélectionnées
            CellulesLumineuses[i][j+1].changerEtat();
            CellulesLumineuses[i][j-1].changerEtat();
            CellulesLumineuses[i+1][j].changerEtat();
            CellulesLumineuses[i-1][j].changerEtat();
            
            // on s'attaque à présent aux coins de la grile
                                                             
        } else if ( i==0 && j==0 ){                    // pour le cas du point (0,0) 
            CellulesLumineuses[i][j+1].changerEtat();
            CellulesLumineuses [i+1][j].changerEtat();
            
        } else if ( i == 0 && j==4){                   // pour le cas du point (0,4)
            CellulesLumineuses[i+1][j].changerEtat();
            CellulesLumineuses[i][j-1].changerEtat();
            
        }else if (i==4 && j==0){                         // pour le cas du point (4,0)
            CellulesLumineuses[i][j+1].changerEtat();
            CellulesLumineuses[i-1][j].changerEtat();
            
        }else if (i==4 && j==4){                          // pour le cas du point (4,4)
            CellulesLumineuses[i][j-1].changerEtat();
            CellulesLumineuses[i-1][j].changerEtat();
            
            // à présent, on isole les cellules sur les bords de la grille (en dehors des coins)
        
        } else if ((i>0 && i<4) && j==0){             // pour les cellules du haut de la grille
            CellulesLumineuses[i-1][j].changerEtat();
            CellulesLumineuses [i+1][j].changerEtat();
            CellulesLumineuses[i][j+1].changerEtat();
            
        }else if ( i==0 && (j>0 && j<4)){       // pour les cellules du coté gauche de la grille
            CellulesLumineuses[i][j+1].changerEtat();
            CellulesLumineuses[i][j-1].changerEtat();
            CellulesLumineuses[i+1][j].changerEtat();
            
        } else if (i ==4 && (j>0 && j<4)){           // pour les cellules du coté droit de la grille
            CellulesLumineuses[i][j-1].changerEtat();
            CellulesLumineuses[i][j+1].changerEtat();
            CellulesLumineuses[i-1][j].changerEtat();
        } else if ((i>0 && i<4) && j==4){                       // pour les cellules du bas de la grille
                      CellulesLumineuses[i][j-1].changerEtat();
                      CellulesLumineuses[i+1][j].changerEtat();
                      CellulesLumineuses[i-1][j].changerEtat();
        }
    
    
        }
    
 }
    

