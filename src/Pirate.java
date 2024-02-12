// Cette classe est une classe enfant de Bateau
public class Pirate extends Bateau {
    private String _pirate;
    private boolean _endommage;
    private static String PIRATE = "Capitaine Pirate";
    // Ce constructeur permet d'instancier un bateau pirate en indiquant sa position en X et en Y ainsi que son capitaine et si il est endommagé ou pas.
    public Pirate(int x, int y, int drapeau, String unPirate, boolean EstEndommager) {
        super(x, y, drapeau);
        this._pirate = unPirate;
        this._endommage = EstEndommager;

    }
    // Ce constructeur permet d'instancier un bateau de pirate en indiquant sa position en X et si il est endommagé ou non.
    public Pirate(int x, int y, int drapeau, boolean EstEndommager) {
        super(x, y, drapeau);
        this._pirate = PIRATE;
        this._endommage = EstEndommager;
    }
    // Cette fonction permet de retourner le nom du bateau soit NomDuBateau + pirate.
    public String getNom() {
        return super.getNom() + " Pirate";
    }
    // Cette fonction permet de retourner l'etat du bateau 
    public String getEtat() {
        if (_endommage == true) {

            return "ayant subi des dommages";

        }
        if (super.estDetruit() == false) {
            return " intact";
        } else {
            return " detruit";
        }

    }
    
    //Cette fonction de surcharge permet de retourne Le nom du bateau avec son drapeau, sa position et son état et le capitaine
    @Override
    public String toString() {
        String result;
        result = getNom() + " avec drapeau" + super.get_drapeau() + " en " + (super.get_x() + "/" + super.get_y())
                + " -> " + getEtat() + " avec a son bord " + _pirate;

        return result;
    }
    // Cette fonction permet d'indiquer que le bateau est pacifique ou non.
    public boolean estPacifique() {
        return false;
    }
    // Cette fonction de surcharge attend un bateau en parmêtre, si le bateau est pacifique, il ne peut pas combattre.
    @Override
    public void combat(Bateau bateau) {

    }
    // Cette fonction permet au bateau passé en paramêtre de recevoir un boulet
    @Override
    public void recoitBoulet(Bateau bateau) {
        // TODO Auto-generated method stub

    }

}
