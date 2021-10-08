/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipnombresint_carriélisa;

import java.util.Scanner;

/**
 *TDA 
 * TP1
 * 04/10/2021
 * @author carrié lisa
 */
public class ManipNombresInt_CarriéLisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner (System.in);
        int entier1;
        System.out.println("Entrer un premier entier");
        entier1= sc.nextInt();
        int entier2;
        System.out.println("Entrer un second entier");
        entier2= sc.nextInt();
        int somme;
        somme = entier1 + entier2;
        System.out.println("Le résultat de la somme est " +somme);
        int diff;
        diff= entier1 - entier2;
        System.out.println("Le résultat de la différence est " +diff);
        int produit;
        produit= entier1 * entier2;
        System.out.println("Le résultat du produit est " +produit);
        int div;
        div= entier1 / entier2;
        System.out.println("Le résulat de la divion est " +div);
        int reste;
        reste= entier1 % entier2;
        System.out.println("Le reste vaut " + reste);
           
        
        
        
    }
    
}
