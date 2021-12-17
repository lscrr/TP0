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
    
    
    public boolean étatCellule (){
        if (état== true){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean allumerCellule(){
            if ( état == false){
                état=true;
         
                return true;
            }
            return false;
        }
    
    public boolean éteindreCellule(){
        if (état==true){
            état= false;
            
            return false;
        }
        return true;
    }
    
    public void changerEtat(){
        if (allumerCellule() == true){
            éteindreCellule();
        }else{
            allumerCellule();
        } 
    } 
    }
    
    
    
    

