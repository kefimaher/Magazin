public class Magazin {

    int identifiant;
    String adresse;

    final int CAPACITE_PRD=50;

    Produit [] tabprod=new Produit[CAPACITE_PRD];

    int compprod;

    public Magazin()
    {}

    public Magazin(int id,String ad)
    {
        identifiant=id;
        adresse=ad;
    }

    public void ajouter(Produit p)
    {
        if(compprod<CAPACITE_PRD) {
            tabprod[compprod] = p;
            compprod++;
            System.out.println("produit ajouté ");
        }
        else{

            System.out.println("Magasin plein");
        }
    }
    public void afficher()
    {

        System.out.println("identifiant :"+this.identifiant+"adresse :"+adresse);
        for (int i=0;i<compprod;i++)
        {

            System.out.println("Marque :"+tabprod[i].marque);
            System.out.println("libelle :"+tabprod[i].libelle);
            // System.out.println("date :"+tabprod[i].dateexp);
            System.out.println("prix :"+tabprod[i].prix);
            System.out.println("Identifiant :"+tabprod[i].identifiant);
        }
    }
}
