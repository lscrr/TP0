/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsout_console_carrié_lisa;

/**
 *
 * @author lisa Carrié
 */
public class Cellule {
    
    boolean état;         // on attribut à la classe cellule un état
    
    
    public boolean étatCellule (){   // on détermine l'état de la cellule : lumineuse ou non
        if (état== true){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean allumerCellule(){   // on allume une cellule éteinte
            if ( état == false){
                état=true;
         
                return true;
            }
            return false;
        }
    
    public boolean éteindreCellule(){      // on éteind une cellule allumée
        if (état==true){
            état= false;
            
            return false;
        }
        return true;
    }
    
    public void changerEtat(){        // si la cellule est éteinte alors on allume sinon on l'éteind
        if (allumerCellule() == true){
            éteindreCellule();
        }else{
            allumerCellule();
        } 
    } 
    }
    
    
    
    

