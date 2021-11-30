/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4_carrié;

import java.util.Scanner;

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
        for(int i=0; i<21; i++){
            Jeton j = new Jeton ("Jaune");
            ListeJoueurs[0].ajouterJeton(j);
        }
        for (int f=0; f<21; f++){
            Jeton g = new Jeton ("Rouge");
            ListeJoueurs[1].ajouterJeton(g);  
        }
         
    }
    
        public void debuterPartie(){
        
        joueurCourant=ListeJoueurs[0];
        boolean coupValide = false;
        int col=-1;
        
    while (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0])==false 
             && grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1])== false 
             && grilleJeu.etreRemplie()==false){
        
        grilleJeu.afficherGrilleSurConsole();
        coupValide = false;
         while (coupValide == false) {
             Scanner sc = new Scanner(System.in);
             System.out.println (joueurCourant + ", saissisez la colonne dans laquelle vous souhaitez jouer.");
             col = sc.nextInt();
             if (col <= 7 && col >= 1 ){      
                 if (grilleJeu.colonneRemplie(col-1)!=true){
                     coupValide = true; 
                 }
             } else { 
                 System.out.println ("erreur, choisissez un nombre entre 1 et 7");
                 coupValide = false;
             }
             Jeton g= joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants -1 ];
             joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1]= null;
             joueurCourant.nombreJetonsRestants --;
             
             grilleJeu.ajouterJetonDansColonne(g, col -1);
             
         }
           if (joueurCourant == ListeJoueurs[1]){
            joueurCourant = ListeJoueurs[0];
        }else {
            joueurCourant= ListeJoueurs[1];
        }  
    
    } 
     System.out.println("Félicitations, "+ joueurCourant+ ", vous remportez la partie!");
     }
    }
        
    