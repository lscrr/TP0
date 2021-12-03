/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_console_lisa;

/**
 *
 * @author lisa
 */
public class Joueur {
    String nom;
    String Couleur;
    Piont ListeJetons []= new Piont [48];
    int nombreJetonsRestants;
    
     public void Joueur (String unNom){ 
        nom = unNom;
        
     }
     public void affecterCouleur ( String uneCouleur){
        Couleur = uneCouleur;
     }
     
    boolean ajouterPiont(Piont p){
        
        for (int i=0; i<48; i++){
            if(ListeJetons[i]== null){
                ListeJetons[i]=p;
            }
        }
        nombreJetonsRestants++;
        return true;
    }
}