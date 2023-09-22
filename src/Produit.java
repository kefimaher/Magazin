public class Produit {
    int identifiant  ;
    String libelle , marque ;
    float prix ;
    public Produit() {}
    public Produit (int identifiant,String libelle,String marque) {

        this.identifiant = identifiant ;
        this.libelle = libelle ;
        this.marque = marque  ;

    }
    public Produit (int identifiant,String libelle,String marque,float prix ) {

      this.identifiant = identifiant ;
      this.libelle = libelle ;
      this.marque = marque  ;
      this.prix = prix  ;
    }
    public  void affiche () {
        System.out.println("l'identfiant est :"+this.identifiant+" Libelle est :"+this.libelle
                +" La maraque est :"+ this.marque+"la prix est :"+this.prix);
    }
    public static void main (String[] args){

        Produit p1 = new Produit (1021," Lait "," Delice ");
        Produit p2 = new Produit (2510," Yayourt "," Vitalait ");
        Produit p3 = new Produit (3250," Tomate "," Sicam ",1200);
        p1.affiche();
        p2.affiche();
        p3.affiche();

    }


}
