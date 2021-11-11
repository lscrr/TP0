/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_carrie;

/**
 *
 * @author titou
 */
public class BouteilleBiere {
    String Nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;
    boolean fermé;
    public void lireEtiquette() {
        System.out.println("Bouteille de " + Nom + " (" + degreAlcool + " degres) \nBrasserie : " + brasserie);
    BouteilleBiere uneBiere = new BouteilleBiere();
    uneBiere.Nom = "Cuvée des trolls";
    uneBiere.degreAlcool = (float) 7.0;
    uneBiere.brasserie = " Dubuisson ";
    uneBiere.ouverte = fermé;
    uneBiere.lireEtiquette();
    System.out.println(uneBiere);
    BouteilleBiere autreBiere = new BouteilleBiere();
    autreBiere.Nom = "Cuvée des trolls";
    autreBiere.degreAlcool = (float) 7.0;
    autreBiere.brasserie = " Dubuisson ";
    autreBiere.ouverte = fermé;
    System.out.println(autreBiere);
    }
public BouteilleBiere ( String unNom, float unDegre, String 
uneBrasserie) {
 Nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
}
}
