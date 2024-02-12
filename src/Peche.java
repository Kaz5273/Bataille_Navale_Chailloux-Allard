// Cette classe est une classe enfant de Bateau
public class Peche extends Bateau {
    private int _nbrmatelot;
    public static int NBR_MATELOT_DEFAULT = 12;
    // Ce constructeur permet d'instancier un bateau de peche en indiquant sa position en X et en Y ainsi que son nombre de matelot.
    public Peche(int x, int y, int drapeau, int unNbrMatelot) {
        super(x, y, drapeau);
        this._nbrmatelot = unNbrMatelot;

    }
    // Ce constructeur permet d'instancier un bateau de peche en indiquant sa position en X et en Y ainsi que son équipe (drapeau).
    public Peche(int x, int y, int drapeau) {
        super(x, y, drapeau);
        this._nbrmatelot = NBR_MATELOT_DEFAULT;

    }
    // Cette fonction permet de récupérer le nom du bateau soit NomDuBateau + Pêche.
    public String getNom() {
        return super.getNom() + " Pêche";
    }
    // Cette fonction de surcharge retourne Le nom du bateau avec son drapeau, sa position et son état.
    @Override
    public String toString() {
        String result;
        result = getNom() + " avec drapeau" + super.get_drapeau() + " en " + (super.get_x() + "," + super.get_y())
                + " -> " + getEtat() + " avec a son bord " + _nbrmatelot + " Matelots";

        return result;
    }
    // Cette fonction permet d'indiquer que le bateau est pacifique ou non.
    public boolean estPacifique() {
        return true;
    }
    // Cette fonction de surcharge attend un bateau en parmêtre, si le bateau est pacifique, il ne peut pas combattre.
    @Override
    public void combat(Bateau bateau) {
        if (estPacifique() == true) {

        }

    }
    // Cette fonction permet au bateau passé en paramêtre de recevoir un boulet.
    @Override
    public void recoitBoulet(Bateau bateau) {
        // TODO Auto-generated method stub
    }

}
