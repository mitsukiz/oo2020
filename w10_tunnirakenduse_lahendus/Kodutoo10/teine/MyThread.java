public class MyThread implements Runnable {

    private Thread thread;
    private String tName;


    public MyThread(String tName, int inter) {
        this.tName = tName;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(tName + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + tName + " dead");
        }

    }

    public void start() {
        System.out.println("Thread " + tName + " starting");
        if (thread == null) {
            thread = new Thread(this, tName);
            thread.start();
        }
    }

}