public class Calculator {
    double rezultat;

    public Calculator(){
        rezultat = 0;
    }
    public Calculator(double rezultat){
        this.rezultat = rezultat;
    }

    public Calculator Adunare(int numar) {
        rezultat += numar;
        return this;
    }

    public Calculator scadere(int numar) {

        rezultat -= numar;
        return this;

    }

    public Calculator inmultire(int numar) {

        rezultat *= numar;
        return this;

    }

    public Calculator impartire(int numar) {

        rezultat /= numar;
        return this;

    }

    public Calculator getRezultat() {
        System.out.println(rezultat);
        return this;
    }
}
