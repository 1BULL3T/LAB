import java.util.Calendar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator(5);
        c.Adunare(3);
        c.scadere(5);
        c.inmultire(6);
        c.impartire(4);
        c.getRezultat();
    }
}