package app;

public class App {
    public static void main(String[] args) {
        
        Pendulum pendel = new Pendulum(1);        
        double form = pendel.getPeriod() * 1000;

        Cogwheel cogwheel = new Cogwheel(2);
        double amount = cogwheel.getAmount();

        int count = 0;

        System.out.println();
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("--Kontrolltöö nr.2 Ülesanne nr.3--");
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println();
        
        for(;;){

            for(int i = 0; i < amount; i++){
                    System.out.println("Pendel tiksub... ");
                    try {
                        Thread.sleep((long) form);
                    } catch(InterruptedException ex){
                        System.exit(0);
                    }
        }
        count ++;
        System.out.println( "Hammasratas tegi " + count + ". ringi.");

        }
    }
}

