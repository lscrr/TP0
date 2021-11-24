package p4_carrié;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lisa carrié
 */
public class Joueur {
    String Nom;
    String Couleur;
    Jeton ListeJetons []= new Jeton [21];
    //int nombreDesintegrateurs;
    int nombreJetonsRestants;
    
    public void Joueur (String unNom){ 
        Nom = unNom;
    }
    public void affecterCouleur ( String uneCouleur){
        Couleur = uneCouleur;
    }
    public boolean ajouterJeton ( Jeton j){
        for (int i=0; i<21; i++){
            if(ListeJetons[i]== null){
                ListeJetons[i]=j;
            }
        }
        nombreJetonsRestants++;
        return true;
    }
   /** public void obtenirDesintegrateur (){
        
    }
    public boolean utiliserDesintegrateur(){
        
    }
    
    public String lireCouleurDuJeton(){
        
    }
    * */
}
    
