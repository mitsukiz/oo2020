/**
 * Animal
 */
public class Animal {

    private String name;
    AnimalType animalType;
    AnimalSizeType animalSizeType;
    AnimalColor animalColor;

    public Animal(String name, AnimalType animalType, AnimalSizeType animalSizeType, AnimalColor animalColor){
        this.name = name;
        this.animalType = animalType;
        this.animalSizeType = animalSizeType;
        this.animalColor = animalColor;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        if(animalType == AnimalType.CAT){
            return "Kass";
        }else if(animalType == AnimalType.DOG){
            return "Koer";
        }else if(animalType == AnimalType.COW){
            return "Lehm";
        }else if(animalType == AnimalType.HORSE){
            return "Hobune";
        }else if(animalType == AnimalType.BIGFOOT){
            return "Suurjalg";
        }else{
            return "muu";
        }
    }
    
    public String getSize(){
        if(animalSizeType == AnimalSizeType.SMALL){
            return "Väike";
        }else if(animalSizeType == AnimalSizeType.MEDIUM){
            return "Keskmine";
        }else if(animalSizeType == AnimalSizeType.LARGE){
            return "Suur";
        }else{
            return "Hiiglane";
        }
    }

    public String getColor(){
        if(animalColor == AnimalColor.RED){
            return "Punane";
        }else if(animalColor == AnimalColor.WHITE){
            return "Valge";
        }else if(animalColor == AnimalColor.GREY){
            return "Hall";
        }else if(animalColor == AnimalColor.BLACK){
            return "Must";
        }else if(animalColor == AnimalColor.ORANGE){
            return "Oranž";
        }else{
            return "Muu";
        }
    }

    public void action(){
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("Nimi: " + name);
        System.out.println("Looma tüüp: " + getType());
        System.out.println("Looma suurus: " + getSize());
        System.out.println("Looma värv: " + getColor());
        if(animalType == AnimalType.CAT){

            System.out.println("Ta ütleb: Mew");

        }else if(animalType == AnimalType.DOG){

            System.out.println("Ta ütleb: Woof Woof");

        }else if(animalType == AnimalType.COW){

            System.out.println("Ta ütleb: Mooo");
        }else if(animalType == AnimalType.HORSE){

            System.out.println("Ta ütleb: Ihaahaa");
        }else if(animalType == AnimalType.BIGFOOT){

            System.out.println("Ta ütleb: RAAAWRHH!!1");
        }
}
}