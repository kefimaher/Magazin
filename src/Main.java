import java.util.Date;

public class Main {

    public static void main (String[] args){
        Date d1 = new Date() ;
        Produit p1 = new Produit (1021," Lait "," Delice ");
        Produit p2 = new Produit (2510," Yayourt "," Vitalait ");
        Produit p3 = new Produit (3250," Tomate "," Sicam ",1200,d1);
        p1.affiche();
        p2.affiche();
        p3.affiche();

      //  p1.toString() ;

    }
}
