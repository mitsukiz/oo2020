import java.util.Scanner;

public class AppAddThread implements Runnable {

    private String tName;
    private AppSystem appSystem;

    private Thread thread;

    public AppAddThread(String name, AppSystem aSystem) {
        tName = name;
        appSystem = aSystem;
    }

    @Override
    public void run() {
        Scanner in = new Scanner(System.in);

        try {
            while (appSystem.isRunning()) {
                String newName;
                System.out.print("ADD: Enter new name: ");
                newName = in.nextLine();
                if (newName.equals("")) {
                    appSystem.end();
                    in.close();
                } else {
                    System.out.println("ADD: Person added: " + newName);
                    appSystem.getPeople().add(newName);
                }
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println("ADD: Thread " + tName + " dead");
        }

    }

    public void start() {
        System.out.println("ADD: Thread " + tName + " starting");
        if (thread == null) {
            thread = new Thread(this, tName);
            thread.start();
        }
    }

    // Küsib AppSystem objektilt kas programm töötab
    // Kui töötab siis iga sekundi tagant küsib nime
    // Nimed lisatakse AppSystemis asuva people listi sisse
    // Kui user input on tühi, siis pannakse app kinni, ehk running = false
    // 9:40

}