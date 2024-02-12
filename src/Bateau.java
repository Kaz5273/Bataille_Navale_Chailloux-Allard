import javax.naming.spi.DirStateFactory.Result;

public abstract class Bateau {

    private int _x;
    private int _y;
    private int _drapeau;
    private boolean _detruit;

    public Bateau(int x, int y, int drapeau) {
        if (this._x > BatailleNavale.MAX_X) {

            this._x = BatailleNavale.MAX_X;
        }
        if (this._x < 0) {

            this._x = 0;
        } else {
            this._x = x;
        }

        if (this._y > BatailleNavale.MAX_Y) {

            this._y = BatailleNavale.MAX_Y;
        }
        if (this._y < 0) {

            this._y = 0;
        } else {
            this._y = y;
        }

        this._x = x;
        this._y = y;
        this._drapeau = drapeau;
        this._detruit = false;

    }

    public boolean estDetruit() {

        _detruit = true;
        return _detruit;

    }

    public double distance(Bateau autreBateau) {
        double result = 0;

        result = Math.sqrt((Math.pow((_x - autreBateau._x), 2) + (Math.pow((_y - autreBateau._y), 2))));

        return result;
    }

    public void avance(int unitsX, int unitsY) {
        if (_x <= BatailleNavale.MAX_X | _x > 0) {
            _x += unitsX;
        }
        if (_y <= BatailleNavale.MAX_Y | _y > 0) {
            _y += unitsY;
        }
    }

    public void coule() {

        _detruit = true;
    }

    public String getNom() {
        return "Bateau";
    }

    public String getEtat() {
        if (_detruit) {
            return " detruit";
        } else {
            return " intact";
        }
    }

    @Override
    public String toString() {
        String result;
        result = getNom() + " avec drapeau " + _drapeau + " en " + (_x + "/" + _y) + " -> " + getEtat()
                + " avec a son bord ";

        return result;
    }

    public abstract void combat(Bateau bateau);

    public abstract void recoitBoulet(Bateau bateau);

    public void rencontre(Bateau bateau) {
        if (_drapeau != bateau._drapeau & distance(bateau) < BatailleNavale.RAYON_RENCONTRE) {
            combat(bateau);
        }

    }

    public int get_x() {
        return _x;
    }

    public int get_y() {
        return _y;
    }

    public int get_drapeau() {
        return _drapeau;
    }

}
