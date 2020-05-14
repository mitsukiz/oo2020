public class Test {
    public static void main(String[] args) throws Exception {
        
        Shape shape1 = new Trapeze(3, 3, 5, 5);
        Shape shape2 = new Rectangle(7, 4);

        System.out.println();
        System.out.println("----Tere tulemast!----");
        System.out.println("----------------------");
        System.out.println();
        System.out.println("Trapetsi ümbermõõt: " + shape1.getCircum() + " cm");
        System.out.println("Ristküliku ümbermõõt: " + shape2.getCircum() + " cm");
        System.out.println();
        System.out.println("Süsteem lõpetab töö...");
        System.out.println();
        System.out.println("------Nägemiseni!------");
        System.out.println("-----------------------");
    }
}   