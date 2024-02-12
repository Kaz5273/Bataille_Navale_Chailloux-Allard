public class Peche extends Bateau {
    private int _nbrmatelot;
    public static int NBR_MATELOT_DEFAULT = 12;

    public Peche(int x, int y, int drapeau, int unNbrMatelot) {
        super(x, y, drapeau);
        this._nbrmatelot = unNbrMatelot;

    }

    public Peche(int x, int y, int drapeau) {
        super(x, y, drapeau);
        this._nbrmatelot = NBR_MATELOT_DEFAULT;

    }

    public String getNom() {
        return super.getNom() + " Pêche";
    }

    @Override
    public String toString() {
        String result;
        result = getNom() + " avec drapeau" + super.get_drapeau() + " en " + (super.get_x() + "," + super.get_y())
                + " -> " + getEtat() + " avec a son bord " + _nbrmatelot + " Matelots";

        return result;
    }

    public boolean estPacifique() {
        return true;
    }

    @Override
    public void combat(Bateau bateau) {
        if (estPacifique() == true) {

        }

    }

    @Override
    public void recoitBoulet(Bateau bateau) {
        // TODO Auto-generated method stub

    }

}
