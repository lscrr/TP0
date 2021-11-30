/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4_carrié;

/**
 *
 * @author lisa carrié
 */
public class Grille {
    Cellule CellulesJeu [][]= new Cellule [6][7];
    
    public Grille (){
        CellulesJeu = new Cellule [6][7];
        for (int i=0; i<=5; i++){
            for (int j=0; j<=6;j++){
                CellulesJeu[i][j]= new Cellule();      
        }
                    } 
    }
    
    public  boolean ajouterJetonDansColonne (Jeton j, int col){
        if (CellulesJeu[0][col].jetonCourant!= null){
            return false;
        }else{
            for (int i=5; i>=0; i--){
                if (CellulesJeu[i][col].jetonCourant==null){
                    CellulesJeu[i][col].affecterJeton(j);
                return true;
                }  
            }
        }
        return true;
    }
    
    public boolean etreRemplie(){
        for(int j=0; j<=6; j++){
            if (CellulesJeu[0][j].jetonCourant== null){
                return false; 
            }
        }
        return true;
    }
    
    public void viderGrille (){
        for (int i=0; i<= 5; i++){
            for (int j=0; j<=6; j++){
                CellulesJeu[i][j].jetonCourant=null;
            }
        }
    }
    
    public void afficherGrilleSurConsole (){
        for (int i=0; i<=5; i++){
            for (int j=0; j<=6; j++){
                System.out.print(" " +CellulesJeu[i][j].lireCouleurDuJeton()+ " " );
            }System.out.println();
           
        }

//couleurs trous noirs
    }
    
    public boolean celluleOccupee (int a, int b){
        if (CellulesJeu[a][b]==null){
            return false;
        }
            return true;
    }
    
    public String lireCouleurDuJeton (int  a , int b){
            return CellulesJeu[a][b].lireCouleurDuJeton();
        }

    public boolean etreGagnantePourJoueur (Joueur G){
        String c=G.Couleur;
        for(int x=0; x>= 0 && x<=5; x++){
            for (int y=0; y>=0 && y<=3; y++){ // verifier si une ligne est gagnante
                if ( c==CellulesJeu[x][y+1].lireCouleurDuJeton() 
                        && c==CellulesJeu[x][y+2].lireCouleurDuJeton() 
                        && c==CellulesJeu[x][y+3].lireCouleurDuJeton()){
                return true;
                    }
    }
        }
        for (int x=0; x>=0 && x<=2; x++){ //verifier si une colonne est gagnante
            for (int y=0; y>= 0 && y<=6; y++){
                if (c==CellulesJeu[x+1][y].lireCouleurDuJeton() 
                        && c==CellulesJeu[x+2][y].lireCouleurDuJeton() 
                        &&c==CellulesJeu[x+3][y].lireCouleurDuJeton()){
                return true;
                    }
            }
        }
        for(int x=0; x>=0 && x<=2; x++){
            for (int y=0; y>= 0 && y<=3; y++){ // verifier si une diagonale montante est gagnante
                if ( c==CellulesJeu[x+1][y+1].lireCouleurDuJeton() 
                        && c==CellulesJeu[x+2][y+2].lireCouleurDuJeton() 
                        &&c==CellulesJeu[x+3][y+3].lireCouleurDuJeton()){
                return true;
            }
            }
            }
        for(int x=0;x>=1 && x<=5; x++){
            for (int y=0;y<=3; y++){ // verifier si une diagonale descendante est gagnante
                if (c==CellulesJeu[x-1][y+1].lireCouleurDuJeton()
                        && c==CellulesJeu[x-2][y+2].lireCouleurDuJeton()
                        && c==CellulesJeu[x-3][y+3].lireCouleurDuJeton()){
                    
                return true;
            }
            }
            }
        return false;
    }
        
    public boolean colonneRemplie (int j){
        if (CellulesJeu[0][j].jetonCourant!= null){
            return true;
        }
        return false;
    }
}
