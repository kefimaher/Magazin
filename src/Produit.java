import java.util.Date;

public class Produit {
    int identifiant  ;
    String libelle , marque ;
    float prix ;
    Date datexp ;
    public Produit() {}
    public Produit (int identifiant,String libelle,String marque) {

        this.identifiant = identifiant ;
        this.libelle = libelle ;
        this.marque = marque  ;

    }
    public Produit (int identifiant,String libelle,String marque,float prix,Date da ) {

      this.identifiant = identifiant ;
      this.libelle = libelle ;
      this.marque = marque  ;
      this.prix = prix  ;
      this.datexp = da ;
    }
    public  void affiche () {
        System.out.println("l'identfiant est :"+this.identifiant+" Libelle est :"+this.libelle
                +" La maraque est :"+ this.marque+"la prix est :"+this.prix+"Date :"+this.datexp);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "identifiant=" + identifiant +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';
    }
}
