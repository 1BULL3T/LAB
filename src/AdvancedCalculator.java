public class AdvancedCalculator extends Calculator {
    public AdvancedCalculator() {
        super();
    }
    public AdvancedCalculator(double x) {
        super(x);
    }
    public void radical(double numar){
        if(numar<=0){
            throw new RuntimeException();
        }
        else{
            rezultat=Math.sqrt(rezultat);
        }
    }
}
