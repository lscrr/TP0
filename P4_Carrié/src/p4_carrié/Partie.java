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
    Grille grilleJeu = new Grille();
    
    public Partie (Joueur J1, Joueur J2){
        ListeJoueurs[0]= J1;
        ListeJoueurs[1]= J2;
    }
    
    public void attribuerCouleursAuxJoueurs (){ 
        
        ListeJoueurs[0].affecterCouleur("Jaune");
        ListeJoueurs[1].affecterCouleur("Rouge");
    }
        
    
    public void initialiserPartie(){
        grilleJeu = new Grille();
        //attribuerCouleursAuxJoueurs();
        for(int i=0; i<=21; i++){
            Jeton j = new Jeton ("Jaune");
            ListeJoueurs[0].ajouterJeton(j);
        }
        for (int f=0; f<=21; f++){
            Jeton g = new Jeton ("Rouge");
            ListeJoueurs[1].ajouterJeton(g);  
        }
         
    }
    
    public void debuterPartie(){
        joueurCourant=ListeJoueurs[0];
        while (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0])==false && grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1])== false && grilleJeu.etreRemplie()==false){
            System.out.println("Saissisez une colonne");
            Jeton x;
            x = ListeJoueurs[0].ListeJetons[0];
            int col; 
            grilleJeu.ajouterJetonDansColonne(x,col);
            
            
                    
       }
    }
    
}
