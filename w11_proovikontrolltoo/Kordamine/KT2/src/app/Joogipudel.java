package app;

public class Joogipudel {

    private double capacity;
    private BottleType type;
    private double weight;
    private double tarePrice;
    private Jook drink;
    private double inside;

    public Joogipudel(double capacity, BottleType type, double tarePrice){
        this.capacity = capacity;
        this.type = type;
        setWeight();
        drink = null;
        inside= 0;
        this.tarePrice = tarePrice;
    }

    public double getCapacity(){
        return capacity;
    }

    public double getPrice(){
        return tarePrice;
    }

    public double getWeight(){
        return weight;
    }

    public double getInside(){
        return inside;
    }

    public void fillBottle(Jook drink){
        this.drink = drink;
        inside = capacity;
    }

    public void emptyBottle(){
        drink = null;
        inside = 0;
    }

    public double wholeWeight(){
        if(drink == null){
            return weight;
        } else {
            return drink.getSpecificWeight()*capacity + weight;
        }
    }

    public double fullPrice(){
        if(drink == null){
            return tarePrice;
        } else {
            return capacity*drink.getLitrePrice() + tarePrice;
        }
    }

    private void setWeight() {
        if (type == BottleType.GLASS) {
            weight = 65;
        } else {
            weight = 5;
        }
    }

    public void addDrinkCustom(Jook drink, double howMuch){
        this.drink = drink;
        inside = howMuch;
    }
}

