package app;

public class Pendulum {

    private int lenght;
    
    public Pendulum (int lenght) {
        this.lenght = lenght;
    }
    public double getPeriod() {
        return (2*Math.PI*(Math.sqrt(lenght/9.8)));
    }

}