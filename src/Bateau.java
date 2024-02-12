import javax.naming.spi.DirStateFactory.Result;

public abstract class Bateau {

    private int _x;
    private int _y;
    private int _drapeau;
    private boolean _detruit;
    // Ce constructeur de la classe Bateau permet d'instancier un bateau avec sa position en X et en Y ainsi que son équipe (drapeau).
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
    // Cette fonction permet de passer l'état du bateau à détruit.
    public boolean estDetruit() {

        _detruit = true;
        return _detruit;

    }
    // Cette fonction indique la distance entre deux bateaux.
    public double distance(Bateau autreBateau) {
        double result = 0;

        result = Math.sqrt((Math.pow((_x - autreBateau._x), 2) + (Math.pow((_y - autreBateau._y), 2))));

        return result;
    }
    // Cette fonction permet de faire avancer le bateau. L'avancement doit etre inférieur aux valeurs MAX indiqué en constante.
    public void avance(int unitsX, int unitsY) {
        if (_x <= BatailleNavale.MAX_X | _x > 0) {
            _x += unitsX;
        }
        if (_y <= BatailleNavale.MAX_Y | _y > 0) {
            _y += unitsY;
        }
    }
    // Cette fonction passe le bateau à l'état de "coulé"
    public void coule() {

        _detruit = true;
    }
    // Cette fonction retourne le nom du bateau
    public String getNom() {
        return "Bateau";
    }
    // Cette fonction retour l'état du bateau
    public String getEtat() {
        if (_detruit) {
            return " detruit";
        } else {
            return " intact";
        }
    }
    // Cette fonction de surcharge retourne Le nom du bateau avec son drapeau, sa position et son état.
    @Override
    public String toString() {
        String result;
        result = getNom() + " avec drapeau " + _drapeau + " en " + (_x + "/" + _y) + " -> " + getEtat()
                + " avec a son bord ";

        return result;
    }
    // Cette fonction abstraite permet de passer le bateau en mode combat en lien avec la fonction rencontre
    public abstract void combat(Bateau bateau);
    // Cette fonction permet à un bateau de recevoir un boulet, tiré par un autre bateau
    public abstract void recoitBoulet(Bateau bateau);
    // Cette fonction permet de passer un bateau en mode combat si la distance est inférieur au rayon de rencontre
    public void rencontre(Bateau bateau) {
        if (_drapeau != bateau._drapeau & distance(bateau) < BatailleNavale.RAYON_RENCONTRE) {
            combat(bateau);
        }

    }
    // Cette fonction recupère la position x du bateau
    public int get_x() {
        return _x;
    }
    // Cette fonction recupère la position y du bateau
    public int get_y() {
        return _y;
    }
    // Cette fonction recupère l'équipe (drapeau) du bateau
    public int get_drapeau() {
        return _drapeau;
    }

}
