import java.util.ArrayList;
import java.util.List;
public class Transaction {
    private final List<Phone> shop = new ArrayList<>();

    public void addItem(Phone phone) {
        shop.add(phone);
    }
    public void removeItem(int index) {
        shop.remove(index);
    }
    public void list() {
        for (int i = 0; i < shop.size(); i++) {
            System.out.println("Tooteid: " + shop.get(i).getMore());
        }
        
    }
}