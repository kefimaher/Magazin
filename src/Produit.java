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
