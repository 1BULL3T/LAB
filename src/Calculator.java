public class Calculator {
    double rezultat;

    public Calculator(){
        rezultat = 0;
    }
    public Calculator(double rezultat){
        this.rezultat = rezultat;
    }

    public void Adunare(int numar) {
        rezultat += numar;

    }

    public void scadere(int numar) {

        rezultat -= numar;

    }

    public void inmultire(int numar) {

        rezultat *= numar;

    }

    public void impartire(int numar) {

        rezultat /= numar;

    }

    public double getRezultat() {
        return rezultat;
    }
}
