package app;

public class Jook {
    
    private String name;
    private double litrePrice;
    private double specificWeight;

    public Jook(String name, double litrePrice, double specificWeight) {
        this.name = name;
        this.litrePrice = litrePrice;
        this.specificWeight = specificWeight;
    }

    public String getDrinkName(){
        return name;
    }

    public double getLitrePrice(){
        return litrePrice;
    }

    public double getSpecificWeight(){
        return specificWeight;
    }

}