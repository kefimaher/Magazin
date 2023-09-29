public class Magazin {

    Produit[] tab = new Produit[10];
    int comptprod ;
    int id ;
    String adresse ;
    int capacite ;

    public Magazin(){};
    public Magazin(String adresse , int capacite)
    {
        this.adresse=adresse ;
        this.capacite = capacite ;
    }

    public Magazin (int id,String adresse ){
        this.id = id ;
        this.adresse = adresse  ;
    }
public void ajouter (Produit p , int cmp , int id , String adresse , int capacite) {

        


}

    public Produit[] getTab() {
        return tab;
    }

    public void setTab(Produit[] tab) {
        this.tab = tab;
    }

    public int getComptprod() {
        return comptprod;
    }

    public void setComptprod(int comptprod) {
        this.comptprod = comptprod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
