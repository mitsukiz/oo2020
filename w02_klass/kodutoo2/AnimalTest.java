/**
 * AnimalTest
 * 
 * Modifitseerisin tunnis tehtut!
 */
public class AnimalTest {

    public static void main(String[] args) {
        Animal animal1 = new Animal("Marcus", AnimalType.CAT, AnimalSizeType.SMALL, AnimalColor.GREY);
        animal1.action();
        Animal animal2 = new Animal("Steven", AnimalType.DOG, AnimalSizeType.SMALL, AnimalColor.ORANGE);
        animal2.action();
        Animal animal3 = new Animal("Carl", AnimalType.HORSE, AnimalSizeType.LARGE, AnimalColor.WHITE);
        animal3.action();
        Animal animal4 = new Animal("Stella", AnimalType.COW, AnimalSizeType.MEDIUM, AnimalColor.BLACK);
        animal4.action();
        Animal animal5 = new Animal("Henry", AnimalType.BIGFOOT, AnimalSizeType.LARGE, AnimalColor.RED);
        animal5.action();
    }
}