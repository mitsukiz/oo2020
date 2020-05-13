public class Phone {
    int firstAmount;
    int newAmount;
    public Phone(int firstAmount, int newAmount) {
        this.firstAmount = firstAmount;
        this.newAmount = newAmount;
    }
    public int getMore(){
        if(firstAmount <= newAmount){
            return 0;
        }else {
            return firstAmount - newAmount;
        }
    }
}