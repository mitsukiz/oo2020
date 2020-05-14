public class AppInfoThread implements Runnable {

    private String tName;
    private Thread thread;

    private int prev;

    private AppSystem aSystem;

    public AppInfoThread(String name, AppSystem aSystem) {
        tName = name;
        this.aSystem = aSystem;
        prev = 0;
    }

    @Override
    public void run() {
        try {
            while (aSystem.isRunning()) {
                if (aSystem.getPeople().size() > prev) {
                    System.out.println("INFO: Nr of people in the list: " + aSystem.getPeople().size());
                    prev = aSystem.getPeople().size();
                }
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("INFO: Thread " + tName + " dead");
        }

    }

    public void start() {
        System.out.println("INFO: Thread " + tName + " starting");
        if (thread == null) {
            thread = new Thread(this, tName);
            thread.start();
        }
    }

    // Jälgib meie listi, mis on AppSystemis
    // Prindib välja listis olevate inimeste arvu
    // Seda tehakse ainult siis, kui arv on muutunud
    // Kui AppSystemis running = false, siis läheb kinni
}