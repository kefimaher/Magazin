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
    };

}
