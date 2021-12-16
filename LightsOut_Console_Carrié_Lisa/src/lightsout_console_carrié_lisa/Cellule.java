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
    
    boolean état;
    boolean c;
    
    public boolean étatCellule (String cellule){
        if (état= true){
            cellule = "allumée";
        }else{
            cellule = "éteinte";
        }
        return false;
    }
    
    public boolean allumerCellule(boolean celluleAllumée){
            if ( état == false){
                état = étatcellule;
                return false;
            }
            return true;
        }
    
    public void éteindreCellule(boolean celluleEteinte){
        if (état==true){
            état = celluleEteinte;
        }
    }
    
    public boolean changerEtat(boolean cellule){
        if (cellule.allumerCellule() = true){
            cellule.éteindreCellule();
        }else{
            cellule.allumerCellule();
        }
    }
    }
    
    
    
    

