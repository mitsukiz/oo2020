/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        Transaction shop = new Transaction();

        Phone sum1 = new Phone(8,3);
        Phone sum2 = new Phone(5,2);
        Phone sum3 = new Phone(3,4);
        shop.addItem(sum1);
        shop.addItem(sum2);
        shop.addItem(sum3);
        shop.list();
        System.out.println();
    }
}