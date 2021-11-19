/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4_carrié;

/**
 *
 * @author lisa carrié
 */
public class Partie {
    Joueur [] ListeJoueurs = new Joueur [2];
    Joueur joueurCourant;
    Grille grilleJeu;
    
    public Partie (Joueur J1, Joueur J2){
     
    }
    
    public void attribuerCouleursAuxJoueurs (){ 
        ListeJoueurs[0].affecterCouleur("Jaune");
        ListeJoueurs[1].affecterCouleur("Rouge");
    }
        
    
    public void initialiserPartie(){
        
    }
    
    public void debuterPartie(){
        
    }
    
}
