public class MyApp {

    private AppSystem aSystem = new AppSystem();
    private AppAddThread addThread;
    private AppInfoThread infoThread;

    public MyApp() {
        addThread = new AppAddThread("Add thread", aSystem);
        infoThread = new AppInfoThread("Info thread", aSystem);
    }

    public void start() {
        addThread.start();
        infoThread.start();
    }
}