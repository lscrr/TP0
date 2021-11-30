/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4_carrié;

/**
 *
 * @author lisa carrié
 */
public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;
    
    public Cellule(){
        jetonCourant= null;    
        trouNoir= false;
        desintegrateur= false;
       
    }
    public boolean affecterJeton (Jeton j){ 
        if (jetonCourant == null){
            jetonCourant=j;
            return true;  
        } else {
            return false;
        }
        
    }
   /** public Jeton recupererJeton(){
        
    }
    public boolean supprimerJeton(){
        
        
        
    }
    public boolean placerTrouNoir(){
        
        
        
    }
    public boolean placerDesintegrateur (){
        
        
        
    }
    public boolean presenceDesintegrateur (){
        if (desintegrateur == true){
        return true;
        } else{ 
            return false;
        }
        
        
    }
    public boolean presenceTrouNoir(){
        if (trouNoir == true){
            return true;
        } else {
            return false;
        }
        
    }
    * */
    public String lireCouleurDuJeton(){
        if ( jetonCourant != null){
            return jetonCourant.Couleur;
        }
        else {
            return "O";
        }
        
    }
   /** public boolean recupererDesintegrateur(){
        
    }
    public boolean activerTrouNoir(){
        
    }
    * */
}
