public class Pirate extends Bateau {
    private String _pirate;
    private boolean _endommage;
    private static String PIRATE = "Capitaine Pirate";

    public Pirate(int x, int y, int drapeau, String unPirate, boolean EstEndommager) {
        super(x, y, drapeau);
        this._pirate = unPirate;
        this._endommage = EstEndommager;

    }

    public Pirate(int x, int y, int drapeau, boolean EstEndommager) {
        super(x, y, drapeau);
        this._pirate = PIRATE;
        this._endommage = EstEndommager;
    }

    public String getNom() {
        return super.getNom() + " Pirate";
    }

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

    @Override
    public String toString() {
        String result;
        result = getNom() + " avec drapeau" + super.get_drapeau() + " en " + (super.get_x() + "/" + super.get_y())
                + " -> " + getEtat() + " avec a son bord " + _pirate;

        return result;
    }

    public boolean estPacifique() {
        return false;
    }

    @Override
    public void combat(Bateau bateau) {

    }

    @Override
    public void recoitBoulet(Bateau bateau) {
        // TODO Auto-generated method stub

    }

}
